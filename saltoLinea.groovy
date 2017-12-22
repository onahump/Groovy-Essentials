new File('file.txt').eachLine { line ->
   def linea = line.split('x')
   def convert = linea.collect{it.toInteger()}
   println convert.sum()

}
