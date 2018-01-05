
//0, 1, 1, 2, 3, 5, 8, 13...
//0, 1, >> 2, 3, 4, 5...

def fibonacci(Integer number){
 if(number < 2 ){
     return number
 } else {
     return fibonacci(number -1) + fibonacci(number-2)
 }
}

fibonacci(7)


(1..10).each{ n ->
    println fibonacci(n)
}
