arr= 1..100

size=arr.size()

for (int i=0; i<size; i++)
{
    if (arr[i] % 3 == 0 && arr[i] % 5 == 0)
    {
    println "FizzBuzz"
    }    
    else if (arr[i] % 3 == 0)
    {
    println "Fizz"
    } 
    else if (arr[i] % 5 == 0)
    {
    println "Buzz"
    }
    else {
    println arr[i]
    }
}