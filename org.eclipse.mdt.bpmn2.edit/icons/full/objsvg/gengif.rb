INKSPACE="/Applications/Inkscape.app/Contents/Resources/bin/inkscape"
Dir.glob("*.svg").each do |svg|
  base = svg.sub(/\.svg/, "")
  cmd = ["#{INKSPACE} --export-height=96 --export-width=96 -f #{svg} -e ../objpng/#{base}.png",
      "convert ../objpng/#{base}.png -channel Alpha -threshold 80% -resize 16x16 ../obj16/#{base}.gif",
      "convert ../objpng/#{base}.png -channel Alpha -threshold 80% -resize 32x32 ../obj32/#{base}.gif",
      "convert ../objpng/#{base}.png -channel Alpha -threshold 80% -resize 64x64 ../obj64/#{base}.gif",
      "convert ../objpng/#{base}.png -resize 96x96 ../obj96/#{base}.gif",
      ]
  system cmd.join(";")
end