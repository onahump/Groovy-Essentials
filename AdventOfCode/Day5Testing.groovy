class Day5Testing extends GroovyTestCase{

  def helper = new Helper()

	void testOne(){
		assert helper.haveMoreThan3Vowels("tetipaa") == "nice"
	} 

	void testTwo(){
		assert helper.notHaveAaBbCcDd("jchzalrndimnmhpaa") == "nice"
	}
	
	void testThree(){
		assert helper.notHaveAbBcPqXY("jchzpbcrnumiamhp") == "naughty"
	}

	void testFour(){
		assert helper.isNice("aeiddcd") == "nice"
	}
}

class Helper{
	def haveMoreThan3Vowels(String linea){
		def vocales = 0
		linea.size().times{
			if(linea[it]== 'a'| linea[it] == 'e'| linea[it] == 'i'| linea[it] == 'o'| linea[it] == 'u'){
				vocales ++
			}
		}  
		if(vocales >= 3){
			"nice"
		}
		else{
			"naughty"
		}
	}

	def notHaveAaBbCcDd(String linea){
		def regex = ~/aa|bb|cc|dd/ 
		if (linea.findAll(regex)){
			"nice"
		}
		else{
			"naughty"
		}
	}

	def notHaveAbBcPqXY(String linea){
		def regex = ~/ab|bc|pq|xy/
		if (linea.findAll(regex)){
			"naughty"
		}
		else{
			"nice"
		}
	}

	def isNice(String linea){
		Integer vocales = 0
		Integer errores = 0
		Integer doble = 0

			linea.size().times{
				if(linea[it] == 'a'|| linea[it] == 'e'|| linea[it] == 'i'|| linea[it] == 'o'|| linea[it] == 'u'){
					vocales ++
				}
				/*if( it != linea.size()-1 ){
		        	if( linea[it] == linea[it+1]){
		            	doble++
		        	}
		    //ver que el par no sea ab cd pq xy
		      		if( (linea[it]+linea[it+1]) == 'ab'|| (linea[it]+linea[it+1]) == 'cd'||(linea[it]+linea[it+1]) == 'pq'||(linea[it]+linea[it+1]) == 'xy'){
		            	errores++
		        	}
		    	}
			}*/	
			// aa, bb, cc, or dd
		    if(linea.findAll(~/([a-z])\1/){
		         doble++
		    }
			//ver que el par no sea ab, cd, pq, or xy
		    if(linea.findAll(~/ab|cd|pq|xy/)){
		        errores++
		    }	
			if (vocales >= 3 && doble >0 && errores == 0){
				"nice"
			}
			else{
				"naughty"
			}	
	}
}
