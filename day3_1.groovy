coordenadas = []
coordenadasSanta = []
coordenadasRoboSanta = []
mapaSanta = [x:0,y:0]
mapaRoboSanta = [x:0,y:0]
memoria = []

archivoTexto = new File('day3.txt')
archivoTexto.text.each{ texto -> coordenadas << texto}

coordenadas.eachWithIndex{ val, index ->
   if (index % 2 == 0){
    coordenadasRoboSanta.add(val)
   }
   else{
    coordenadasSanta.add(val)
   }
}


memoria << mapaSanta
coordenadasSanta.each{ idx ->
  switch ( idx ) {
        case "^":
        mapaSanta = [x:mapaSanta.x,y:mapaSanta.y + 1]
        memoria << mapaSanta
        break;

        case "<":
        mapaSanta = [x:mapaSanta.x - 1,y:mapaSanta.y]
        memoria << mapaSanta
        break;

        case ">":
        mapaSanta = [x:mapaSanta.x + 1,y:mapaSanta.y]
        memoria << mapaSanta
        break;

        case "v":
        mapaSanta = [x:mapaSanta.x,y:mapaSanta.y - 1]
        memoria << mapaSanta
        break;
  }
}

coordenadasRoboSanta.each{ i ->
  switch ( i ) {
        case "^":
        mapaRoboSanta = [x:mapaRoboSanta.x,y:mapaRoboSanta.y + 1]
        memoria << mapaRoboSanta
        break;

        case "<":
        mapaRoboSanta = [x:mapaRoboSanta.x - 1,y:mapaRoboSanta.y]
        memoria << mapaRoboSanta
        break;

        case ">":
        mapaRoboSanta = [x:mapaRoboSanta.x + 1,y:mapaRoboSanta.y]
        memoria << mapaRoboSanta
        break;

        case "v":
        mapaRoboSanta = [x:mapaRoboSanta.x,y:mapaRoboSanta.y - 1]
        memoria << mapaRoboSanta
        break;
  }
}

println memoria.unique().size()