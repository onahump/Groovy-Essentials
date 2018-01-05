import java.security.MessageDigest

def digest = MessageDigest.getInstance("MD5")
def incremento = 1, hash, texto

for (i in 1..10000000) {  
	texto = "bgvyzdsv" + i
	def hashGenerado = new BigInteger(1,digest.digest(texto.getBytes())).toString(16).padLeft(32,"0")
	def igualar = hashGenerado.substring(0,5) //Para el problema 4.1 en vez de 5 - 6
	if(igualar == "00000" ){  //Para el problema 4.1 agregar un "0" 
		hash = hashGenerado  
		break
	}else{
		incremento += 1
	}
}

println hash
println texto

//assert hash == "000001dbbfa3a5c83a2d506429c7b00e"
//assert texto == "abcdef609043"


