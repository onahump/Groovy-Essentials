lista = [1,1,10]

def smaller(def numbersmall){
    memoria = lista[0]
    for(i=0; i<lista.size();i++){
      if(lista [i] <  memoria){
        memoria = lista[i]
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

def numbersamaller = smaller(lista)
def paper = amountofpaper(lista)

println paper
println numbersamaller
