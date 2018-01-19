class Day5Testing extends GroovyTestCase{

  def helper = new Helper()

	void testOne(){
		assert helper.pairOfTwoLetters("lstuvaa")
	} 

	void testTwo(){
		assert helper.pairOfTwoLettersDouble("uurcxstgtgmygtbs") 
	}
	
	void testThree(){
		assert helper.isNice("xyx") 
	}
}

class Helper{
	def pairOfTwoLetters(String linea){
		Boolean doble
		linea.size().times{
			if( it != linea.size()-1 ){
	        	if(linea[it] == linea[it+1]){
	            	doble = true
	        	}
	        	else{
	        		doble = false
	        	}
	        }
		}
		doble
	}

	def pairOfTwoLettersDouble(String linea){
		def regex = ~/\w*(\w{1})\w\1/ 
		if (linea.findAll(regex)){
			true
		}
		else{
			false
		}
	}

	def isNice(String linea){
		Boolean doble
		linea.size().times{
			if( it != linea.size()-1 ){
		        if(linea[it] == linea[it+2]){
	            	doble = true
	        	}
	        	else{
	        		doble = false
	        	}
	        }
		}
		doble
	}
}
