archivoTexto = new File('day3.txt')

santaPosition = [x:0,y:0]
casasVisitadas = 1

println santaPosition
println santaPosition.x.getClass()



def readFile(def file){
    file.text.each{ i ->
      println i
    }
}

def coordenadas = readFile(archivoTexto)
