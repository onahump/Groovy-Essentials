def list = [5, 10, 15, 20, 25, 30]
listonas = []
listi = []
list.eachWithIndex { val, idx ->
   if (idx % 2 == 0){
   	listonas.add(val)
   }
   else{
   	listi.add(val)
   }
}

println listonas
println listi
