class Day5Testing extends GroovyTestCase{

  def helper = new Helper()


	void testOne(){
		assert helper.isNaughty("ugknbfddgicrmopn") 
	} 

	void testTwo(){
		assert helper.isNaughty2("abcdefghii")
	}
	
	void testThree(){
		assert helper.isNaughty3("oipciqolm")
	}

}

class Helper{

	def isNaughty(String linea){
		def regex = ~/[aeiouAEIOU]/
		 // ~/([a-z])\1/ 
		if (linea.findAll(regex)){
			true
		}
		else{
			false
		}
	}

	def isNaughty2(String linea){
		def regex = ~/([a-z])\1/ 
		if (linea.findAll(regex)){
			true
		}
		else{
			false
		}
	}


	def isNaughty3(String linea){
		def regex = ~/[ab|bc]/
		if (linea.findAll(regex)){
			true
		}
		else{
			false
		}
}


