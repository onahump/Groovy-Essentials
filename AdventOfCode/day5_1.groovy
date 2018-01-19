def nice = 0
def txt = new File("day5.txt").eachLine{ linea ->
	linea.size().times{
		if( it != linea.size()-1 ){
        	if( linea[it] == linea[it+1]){
            	doble++
        	}
    //ver que el par no sea ab cd pq xy
      		if( (linea[it]+linea[it+1]+linea[it])){
            	++
        	}
    	}
	}
	if (vocales >= 3 && doble >0 && errores == 0){
		nice++
	}	
}

println nice