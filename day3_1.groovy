coordenadas = []

mapa = [x:0,y:0]

memoriaSanta = []
memoriaRoboSanta = []


archivoTexto = new File('day3.txt')
archivoTexto.text.each{ texto -> coordenadas << texto}

coordenadas.each{ i ->
    if (i % 2 == 0) {
        i << memoriaSanta
    }

}

println memoriaSanta
println memoriaRoboSanta
/*

coordenadas.each{ idx ->
  switch ( idx ) {
        case "^":
        mapa = [x:mapa.x,y:mapa.y + 1]
        memoria << mapa
        break;

        case "<":
        mapa = [x:mapa.x - 1,y:mapa.y]
        memoria << mapa
        break;

        case ">":
        mapa = [x:mapa.x + 1,y:mapa.y]
        memoria << mapa
        break;

        case "v":
        mapa = [x:mapa.x,y:mapa.y - 1]
        memoria << mapa
        break;
  }
}

println memoria.unique().size()
*/