def lista1 = 1..10


def multiplo(def listita){
    def lista2 = []
    for(i=0; i<listita.size(); i++){    
        if(listita[i] % 3 == 0 || listita[i] % 5 == 0){  
        lista2.add(listita[i])
        }                    
    }
    return lista2
} 
def l = multiplo(lista1)
println l

def suma(def listota){
    def sum = 0
    for(j=0;j<listota.size(); j++){
    sum += listota[j]  
    }
    return sum
}

def res = suma(l)
println res




