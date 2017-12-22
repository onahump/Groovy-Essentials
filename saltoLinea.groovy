archivoTexto = new File('file.txt')

//def ObteniendoDimensiones (def dimensiones){
//   archivoTexto.eachLine { cadaLinea ->
//   def cadaLineaEnListaDeEnteros = cadaLinea.split('x').collect{it.toInteger()}
//   println cadaLineaEnListaDeEnteros
//   }
//}

def getDimensionsList(def textFile){
  def dimensionList = []
  textFile.text.eachLine{ line ->
    dimensionList << line.split('x').collect{it.toInteger()}
  }
  dimensionList
}


//def dimensionesCadaRegalo = ObteniendoDimensiones(archivoTexto)

  def boxesDimensions = getDimensionsList(archivoTexto)
  def total = []
    boxesDimensions.each{ boxDimensions ->
      def a1 = boxDimensions[0] * boxDimensions[1]
      def a2 = boxDimensions[1] * boxDimensions[2]
      def a3 = boxDimensions[2] * boxDimensions[0]

      def area = 2 * a1 + 2 * a2 + 2 * a3

      def extrapaper = Math.min(a1,Math.min(a2,a3))
      totalPaper = area + extrapaper
      total.add(totalPaper)
    }
    println total.sum()




