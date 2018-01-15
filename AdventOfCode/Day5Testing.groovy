class Day5Testing extends GroovyTestCase{

  def helper = new Helper()


	void testOne(){
		assert helper.isNaughty("ugknbfddgicrmopn") == "naughty"
	} 

	void testTwo(){
		assert helper.isNaughty2("abcdefghii") == "naughty"
	}
	
	void testThree(){
		assert helper.isNaughty3("oipciqolm") == "naughty"
	}

}

class Helper{

	def isNaughty(String linea){
		def regex = ~/[aeiouAEIOU]/
		 // ~/([a-z])\1/ 
		if (linea.findAll(regex)){
			linea  = "naughty"
		}
		else{
			linea = "nice"
		}
	linea
	}

	def isNaughty2(String linea){
		def regex = ~/([a-z])\1/ 
		if (linea.findAll(regex)){
			linea  = "naughty"
		}
		else{
			linea = "nice"
		}
	linea
	}


	def isNaughty3(String linea){
		def regex = ~/^a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z*+/ 
		if (linea.findAll(regex)){
		    linea  = "naughty"
		}
		else{
		    linea = "nice"
		}
		print linea
	}
}


