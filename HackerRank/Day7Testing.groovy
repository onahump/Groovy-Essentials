def br = new BufferedReader(new InputStreamReader(System.in))
def sizeBookPhone = br.readLine().toInteger()
def mapa = [:]
def l = []
def maparesults = []

(1..sizeBookPhone).each{
    def texto = br.readLine()
    def listaTexto = []
    listaTexto = texto.split(' ')
    mapa.put(listaTexto[0],listaTexto[1])
}
(1..sizeBookPhone).each{
    l << br.readLine()
}

for( item  in mapa ){
    maparesults << item.key 
}

def commons = maparesults.intersect(l)
def difference =  l.plus(commons)
difference.removeAll(commons)

commons.each(){i-> 
    println mapa[i]
}

difference.each(){
    println "Not found."
}

/*
mapa.each(){a,b -> a   
    for(i..i.size()){i-> 
        println i
        if(i == a){
            println mapa["${a}"]
        }else{
            println "Not found"
        }
    }
}
*/
