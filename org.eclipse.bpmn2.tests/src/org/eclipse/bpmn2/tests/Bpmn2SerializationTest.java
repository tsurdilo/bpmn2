package org.eclipse.bpmn2.tests;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.bpmn2.Definitions;
import org.eclipse.bpmn2.util.Bpmn2ResourceFactoryImpl;
import org.eclipse.bpmn2.util.Bpmn2XMIResourceFactoryImpl;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.Before;

public abstract class Bpmn2SerializationTest {

    protected static final String EXTENSION_BPMN2_XML = "bpmn2";

    protected static final String EXTENSION_BPMN2_XMI = "bpmn2xmi";

    protected static final String TMP_DIR = "tmp";

    protected List<URI> createdFiles;

    /**
     * Registers the BPMN2 resource factory under the "bpmn2" and the BPMN2 XMI resource factory under the
     * "bpmn2xmi" extension (only in standalone mode).
     */
    @Before
    public void setUpResourceFactoryRegistry() {
        if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(EXTENSION_BPMN2_XML,
                    new Bpmn2ResourceFactoryImpl());

            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(EXTENSION_BPMN2_XMI,
                    new Bpmn2XMIResourceFactoryImpl());
        }
    }

    @Before
    public void setUpFields() {
        createdFiles = new LinkedList<URI>();
    }

    /**
     * Tears down a test run by clearing the resource factory registry and moving {@link #createdFiles created
     * files} to a result folder. 
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        if (!EMFPlugin.IS_ECLIPSE_RUNNING)
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().clear();

        TestHelper.moveFiles(createdFiles);
    }

    /**
     * Creates a resource with the specified name, sets its content and saves it.
     * Afterwards, loads the thus created resource from a fresh resource set and returns it.
     * 
     * @param name Filename, without folder and extension.
     * @param model The model to store.
     * @return The loaded resource.
     * @throws IOException
     */
    public Resource saveAndLoadModel(final String name, Definitions model) throws IOException {
        return saveAndLoadModel(name, model, false);
    }

    /**
     * Creates a resource with the specified name, sets its content and saves it.
     * Afterwards, loads the thus created resource from a fresh resource set and returns it.
     * 
     * @param name Filename, without folder and extension.
     * @param model The model to store.
     * @param useAbsoluteUri Use an absolute instead of a relative URI.
     * @return The loaded resource.
     * @throws IOException
     */
    public Resource saveAndLoadModel(final String name, Definitions model, boolean useAbsoluteUri)
            throws IOException {
        URI fileUri = getCompletePathURI(name, useAbsoluteUri);
        TestHelper.createResourceWithContent(fileUri, model);
        createdFiles.add(fileUri);

        return TestHelper.getResource(fileUri);
    }

    /**
     * Composes the complete URI for a test file with the given name by prepending the
     * test directory ("{@linkplain #TMP_DIR tmp}" and the {@linkplain #getSubDirectory() sub directory})
     * and appending the {@linkplain #getFileExtension() file extension}.
     * @param filename The name of the file, may include further directories.
     * @param absolute If <code>true</code>, an absolute URI is returned (as determined by <code>new File(uri)</code>).
     * Otherwise, a relative URI.
     * @return The URI denoting the complete path for the test file.
     */
    protected URI getCompletePathURI(String filename, boolean absolute) {
        StringBuilder builder = new StringBuilder(TMP_DIR).append('/');
        if (getSubDirectory() != null)
            builder.append(getSubDirectory()).append('/');
        builder.append(filename).append('.').append(getFileExtension());
        return URI.createFileURI(absolute ? new File(builder.toString()).getAbsolutePath()
                : builder.toString());
    }

    protected String getSubDirectory() {
        return null;
    }

    protected abstract String getFileExtension();
}