class Day5Testing extends GroovyTestCase{

  def helper = new Helper()


	void testOne(){
		assert helper.isNaughty("Hola Mundo") == 3
	} 
}

class Helper{

	def isNaughty(String linea){
		def regex = ~/[aeiouAEIOU]/ || ~/([a-z])\1/ ||
		linea.findAll(regex).size()
	}


}