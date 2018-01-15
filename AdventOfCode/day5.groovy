def regex = ~/[aeiou].*[aeiou].*[aeiou]|([a-z])\1/	
def naughty = 0
def nice = 0  

def txt = new File("day5.txt").eachLine { line ->
	if(line.findAll(regex)){
		nice ++
	}
	else{
		naughty ++
	}
}

println "Nice: ${nice}"
println "Naughty: ${naughty}"
