package org.eclipse.bpmn2.tools.xsltFromEcore.jet;

import org.eclipse.emf.ecore.*;

/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */

 
 
 public class XMIToXML
 {
  protected static String nl;
  public static synchronized XMIToXML create(String lineSeparator)
  {
    nl = lineSeparator;
    XMIToXML result = new XMIToXML();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + NL + "<xsl:stylesheet version=\"2.0\"" + NL + "\txmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\"" + NL + "\txmlns:xmi=\"http://schema.omg.org/spec/XMI\"" + NL + "\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"" + NL + "\txmlns:bpmn=\"http://www.omg.org/spec/BPMN/20100524/MODEL\"" + NL + "\txmlns:bpmndi=\"http://www.omg.org/spec/BPMN/20100524/DI\"" + NL + "\txmlns:di=\"http://www.omg.org/spec/DD/20100524/DI\"" + NL + "\txmlns:dc=\"http://www.omg.org/spec/DD/20100524/DC\" " + NL + "\txmlns:bpmnxmi=\"http://www.omg.org/spec/BPMN/20100524/MODEL-XMI\"" + NL + "\txmlns:bpmndixmi=\"http://www.omg.org/spec/BPMN/20100524/DI-XMI\"" + NL + "\txmlns:dixmi=\"http://www.omg.org/spec/DD/20100524/DI-XMI\"" + NL + "\txmlns:dcxmi=\"http://www.omg.org/spec/DD/20100524/DC-XMI\"> " + NL + "" + NL + "\t<xsl:template match=\"/\">" + NL + "\t  <xsl:apply-templates/>" + NL + "\t</xsl:template>" + NL + "\t\t" + NL + "\t<xsl:template name=\"EObjectTemplate\">" + NL + "\t  <!-- TODO: Add your copy logic for extension attributes-->" + NL + "\t</xsl:template>" + NL;
  protected final String TEXT_2 = NL + "\t<xsl:template name=\"";
  protected final String TEXT_3 = "Template\" ";
  protected final String TEXT_4 = " match=\"//bpmnxmi:Definitions\" ";
  protected final String TEXT_5 = ">";
  protected final String TEXT_6 = "   <bpmn:definitions>";
  protected final String TEXT_7 = NL + "\t <xsl:call-template name=\"";
  protected final String TEXT_8 = "Template\"/> ";
  protected final String TEXT_9 = NL + "\t\t\t<xsl:if test=\"";
  protected final String TEXT_10 = "\"><xsl:attribute name=\"";
  protected final String TEXT_11 = "\"> <xsl:value-of select=\"";
  protected final String TEXT_12 = "\" /> </xsl:attribute></xsl:if>\t\t\t";
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL + "\t\t\t<xsl:if test=\"";
  protected final String TEXT_15 = "\"><xsl:attribute name=\"";
  protected final String TEXT_16 = "\"> <xsl:value-of select=\"";
  protected final String TEXT_17 = "\" /> </xsl:attribute></xsl:if>\t\t\t";
  protected final String TEXT_18 = NL + "\t\t\t<";
  protected final String TEXT_19 = ":";
  protected final String TEXT_20 = "><xsl:value-of select=\"";
  protected final String TEXT_21 = "\"/></";
  protected final String TEXT_22 = ":";
  protected final String TEXT_23 = ">";
  protected final String TEXT_24 = "\t\t\t";
  protected final String TEXT_25 = NL + "\t\t\t<xsl:for-each select=\"";
  protected final String TEXT_26 = "\">";
  protected final String TEXT_27 = NL + "\t\t\t<xsl:for-each select=\"";
  protected final String TEXT_28 = "[contains(@xmi:type, '";
  protected final String TEXT_29 = "') or contains(@xsi:type, '";
  protected final String TEXT_30 = "')]\">";
  protected final String TEXT_31 = NL + " \t\t\t  <";
  protected final String TEXT_32 = ":";
  protected final String TEXT_33 = ">" + NL + "\t\t\t    <xsl:call-template name=\"";
  protected final String TEXT_34 = "Template\" />\t\t\t   " + NL + "\t\t\t  </";
  protected final String TEXT_35 = ":";
  protected final String TEXT_36 = ">" + NL + "\t\t\t</xsl:for-each>";
  protected final String TEXT_37 = NL + "\t\t\t";
  protected final String TEXT_38 = "   </bpmn:definitions>";
  protected final String TEXT_39 = NL + "\t</xsl:template>" + NL + "\t";
  protected final String TEXT_40 = NL + NL + "</xsl:stylesheet>";
  protected final String TEXT_41 = NL;

   public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     JetInput input = (JetInput) argument; 
    stringBuffer.append(TEXT_1);
     for(EClass c: input.getClasses()) { 
    stringBuffer.append(TEXT_2);
    stringBuffer.append(c.getName());
    stringBuffer.append(TEXT_3);
    if("Definitions".equals(c.getName())){
    stringBuffer.append(TEXT_4);
    }
    stringBuffer.append(TEXT_5);
    if("Definitions".equals(c.getName())){
    stringBuffer.append(TEXT_6);
    }
    for(EClass superClass: c.getESuperTypes()) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(superClass.getName());
    stringBuffer.append(TEXT_8);
    }
     for(EStructuralFeature feature: input.getAllFeatureThatAreAttributesInXml(c)) { 
    stringBuffer.append(TEXT_9);
    stringBuffer.append(input.getXPathForXMI(feature));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(feature.getName() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(input.getXPathForXMI(feature));
    stringBuffer.append(TEXT_12);
     } 
     for(EStructuralFeature feature: input.getAllElementsInXml(c)) { 
    stringBuffer.append(TEXT_13);
     if(input.isReference(feature)) { 
    stringBuffer.append(TEXT_14);
    stringBuffer.append(input.getXPathForXMI(feature));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(feature.getName() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append(input.getXPathForXMI(feature) );
    stringBuffer.append(TEXT_17);
     } else if(input.isSimpleElement(feature)) { 
    stringBuffer.append(TEXT_18);
    stringBuffer.append(input.getPrefix(feature));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(input.getXPathForXMI(feature));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(input.getPrefix(feature));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_23);
     } else {
      for(EStructuralFeature subFeature: input.getAllSubFeatures(feature)) { 

    stringBuffer.append(TEXT_24);
    if(feature.equals(subFeature)){
    stringBuffer.append(TEXT_25);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_26);
    } else {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(feature.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_30);
    }
    stringBuffer.append(TEXT_31);
    stringBuffer.append(input.getPrefix(subFeature));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(input.getExtendedMetadata().getName(subFeature));
    stringBuffer.append(TEXT_33);
    stringBuffer.append(subFeature.getEType().getName());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(input.getPrefix(subFeature));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(input.getExtendedMetadata().getName(subFeature));
    stringBuffer.append(TEXT_36);
     } 
    stringBuffer.append(TEXT_37);
     } } 
    if("Definitions".equals(c.getName())){
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
     }
    stringBuffer.append(TEXT_40);
    stringBuffer.append(TEXT_41);
    return stringBuffer.toString();
  }
}
