def lista = 1..999
def lista2 = []

size = lista.size()   //Tamaño de la lista1

for(i=0; i<size; i++){    //Itera la lista
    if(lista[i] % 3 == 0 || lista[i] % 5 == 0){  //Si un numero de la lista en la posicion i es divisible entre 3 y 5
          lista2.add(lista[i])                   // Agrega el numero a la lista 2
            }
}

println "Los numero que integran la nueva lista son " + lista2

size2 = lista2.size()  //Tamaño de la lista2

def sum = 0       //Definimos la variable suma igual a 0

for(j=0;j<size2; j++){ //Iteramos la lista 2
    sum += lista2[j]   //La suma va a ser igual a la suma mas el numero que este en la posiicon j de la lista (sum = sum + lista[j])
}

println "La suma de todos los numeros dentro de la lista es " + sum

