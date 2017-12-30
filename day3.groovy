coordenadas = []

mapa = [x:0,y:0]
memoria = []
casas_visitadas = 1

memoria << mapa
archivoTexto = new File('day3.txt')
archivoTexto.text.each{ texto -> coordenadas << texto}

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





