lista = []

new File('file.txt').eachLine { line ->
   def linea = line.split('x')
   def convert = linea.collect{it.toInteger()}
   lista.add(convert.sum())
}
println lista
