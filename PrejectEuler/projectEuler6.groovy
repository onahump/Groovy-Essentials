def numeros = 1..100
def numberExponent = []

sumNumbers = numeros.sum()
sqreNumbers = sumNumbers.power(2)

numeros.each{number ->
  eachNumberWithExponent = number.power(2)
  numberExponent.add(eachNumberWithExponent)
}

total = sqreNumbers - numberExponent.sum()

println total


