class Day5Testing extends GroovyTestCase{

  def helper = new Helper()


	void testOne(){
		assert helper.isNaughty("ugikpan") == true
	} 

	void testTwo(){
		assert helper.isNaughty2("abcdefghhhhi") == true
	}
	
	void testThree(){
		assert helper.isNaughty3("oipciqolxm") == true
	}

}

class Helper{

	def isNaughty(String linea){
		def regex = ~/[aeiou].*[aeiou].*[aeiou]/
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
		def regex = ~/ab|bc|pq|xy/
		if (linea.findAll(regex)){
			true
		}
		else{
			false
		}
	}
}
