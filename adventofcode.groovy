def santafloor(def simbolo){
  floor = 0
  for(i=0; i<simbolo.size(); i++){
      if(simbolo[i] == "("){
        floor += 1
      }else if ( simbolo[i] == ")"){
        floor -= 1
      }else {
        println "Intenta con '(' para subir o ')' para bajar"
      }
  }
  return floor
}

def santa = santafloor("()())))((((((((((")
println santa
