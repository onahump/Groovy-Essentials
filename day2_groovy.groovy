println "Hola al dia 2 de adventure of code"
println "Dia 2 de adventure of code"

def prueba = new File ("file.txt")
def a1
def a2
def a3
def extra
def val1
def val2
def total2=0
int areatotal=0

//prueba.eachLine(){
//
//      //obtenemos los valores de cada una de las tres áreas
//      a1= it.split("x")[0].toInteger() * it.split("x")[1].toInteger()
//      a2= it.split("x")[1].toInteger() * it.split("x")[2].toInteger()
//      a3= it.split("x")[0].toInteger() * it.split("x")[2].toInteger()
//
//      //obteniendo el valor minimo de las áreas que será el extra
//      extra=Math.min( a1, Math.min(a2,a3))
//
//      //obtenemos los valores de las áreas multiplicado por dos
//      a1=a1*2
//      a2=a2*2
//      a3=a3*2
//
////sumamos al area total a un acumulado
//      areatotal=areatotal+a1+a2+a3+extra
//
//}

//      println "Area total de: "+areatotal

//--------------------------------------------------parte 2

Integer ribbonSize = 0
prueba.eachLine(){ box ->

  boxDimensions = box.split("x").collect{it.toInteger()}
  p1 = boxDimensions[0]*2 + boxDimensions[1]*2
  p2 = boxDimensions[0]*2 + boxDimensions[2]*2
  p3 = boxDimensions[1]*2 + boxDimensions[2]*2
  smallPerimeter = Math.min(p1, Math.min(p2,p3))
  vol = boxDimensions[0]*boxDimensions[1]*boxDimensions[2]
  ribbonSize = ribbonSize + (smallPerimeter+vol)
  println "Line: ${box}, vol: ${vol} small perimeter: ${smallPerimeter}, sum: ${vol+smallPerimeter}"
}

println "Cinta: ${ribbonSize}"