import java.security.MessageDigest

def digest = MessageDigest.getInstance("MD5")
def texto
def incremento = 0	
def hash

for (i = 0; i <100000000 ; i++) {  
	texto = "bgvyzdsv" + incremento
	def hashGenerado = new BigInteger(1,digest.digest(texto.getBytes())).toString(16).padLeft(32,"0")
	def igualar = hashGenerado.substring(0,5)
	if(igualar == "00000" ){
		hash = hashGenerado
		break
	}else{
		incremento += 1	
	}
}
println hash
println texto

//assert texto == "pqrstuv1048970"
//assert hash == "000006136ef2ff3b291c85725f17325c"




