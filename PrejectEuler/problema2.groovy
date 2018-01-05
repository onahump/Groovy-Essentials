def lista = [1,2]
def res = 0

for(i=0; i<30; i++){
  res = lista[i]+lista[i+1]
  lista.add(res)
}

println "La serie fibonachi es la siguiente" + lista

sum = 0

for (j=0; j<lista.size(); j++){
  sum += lista[j]
}

println "La suma de la serie fibonacci es: " + sum

