def lista = 1..10
def lista2 = []

size = lista.size()

for(i=lista[1]; lista=size; i++){
  if (i % 3 == 0 || i % 5 == 0){
    lista2.add(i)
  }
}

println lista2