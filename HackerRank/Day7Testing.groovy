def br = new BufferedReader(new InputStreamReader(System.in))
def sizeOfBookPhone = br.readLine().toInteger()
def giveMeAPhone = []
def bookPhone = [:]
def listota = [] 
(1..sizeOfBookPhone).each{
    def texto = br.readLine()
    def listTexto = []
    listTexto = texto.split(' ')
    bookPhone.put(listTexto[0], listTexto[1])
}

(1..sizeOfBookPhone).each{
    giveMeAPhone << br.readLine()
}

bookPhone.each(){a,b-> giveMeAPhone << a  }
println giveMeAPhone


