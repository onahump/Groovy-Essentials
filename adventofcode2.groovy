lista = "12x3x2"
splitingLista = lista.split('x')


def smaller(def numbersmall){
    memoria = splitingLista[0]
    for(i=0; i<splitingLlista.size();i++){
      if(splitingLista [i] <  memoria){
        memoria = splitingLista[i]
      }
    }
   return memoria
}


def amountofpaper(def medidas){
      amount = 0
      l = medidas[0]
      w = medidas[1]
      h = medidas[2]
      amount = 2*(l*w)+2*(w*h)+2*(h*l)
      return amount
}

def numbersamaller = smaller(splitingLista)
def paper = amountofpaper(splitingLista)

println paper
println numbersamaller
