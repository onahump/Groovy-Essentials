def nice = []
def naughty = []

def txt = new File("day5.txt").eachLine { line ->
	for(i in 0..<line.size()){
		if (line[i] == "a") {
			nice << line
			break
		}
		else{
			naughty << line
		}
	}
}

println nice
println naughty
