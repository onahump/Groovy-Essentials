archivoTexto = new File('file2.txt')

def getDimensionsList(def textFile){
  def dimensionList = []
  textFile.text.eachLine{ line ->
    dimensionList << line.split('x').collect{it.toInteger()}
  }
  dimensionList
}

  def boxesDimensions = getDimensionsList(archivoTexto)
  def total = []
    boxesDimensions.each{ boxDimensions ->
      def p1 = boxDimensions[0]*2 + boxDimensions[1]*2
      def p2 = boxDimensions[1]*2 + boxDimensions[2]*2
      def p3 = boxDimensions[2]*2 + boxDimensions[0]*2

      def smallestPerimeter = Math.min(p1,Math.min(p2,p3))
      def bowOfRibbon = boxDimensions[0] * boxDimensions[1] * boxDimensions[2]
      def totalRibbon = smallestPerimeter + bowOfRibbon
      println totalRibbon
      total.add(totalRibbon)
    }

  println total.sum()





