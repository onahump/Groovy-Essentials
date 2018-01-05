
class TestingExercise extends GroovyTestCase{

  def helper = new Helper()

  void testOne(){
    assert helper.isMultipleOfFive(10) == "Es multiplo de 5"
  }

  void testTwo(){
    assert helper.isMultipleOfFive(11) == "No es multiplo de 5"
  }


  void testThree(){
    assert helper.isMultipleOfThree(12) == "Es multiplo de 3"
  }

  void testFour(){
    assert helper.isMultipleOfThree(11) == "No es multiplo de 3"
  }

  void testFive(){
    assert helper.fizzBuzz(15) == "Fizzbuzz"
  }

  void testSix(){
    assert helper.fizz(50) == "Fizz"
  }

  void testSeven(){
    assert helper.buzz(27) == "Buzz"
  }
}


class Helper{
  def isMultipleOfFive(Integer number){
     if (number % 5 == 0){
          "Es multiplo de 5"
     }
     else {
          "No es multiplo de 5"
     }
  }

 def isMultipleOfThree(Integer number){
     if (number % 3 == 0){
        "Es multiplo de 3"
     }
     else{
        "No es multiplo de 3"
     }
  }

 def fizzBuzz(Integer number){
    if (number % 3 == 0 && number % 5 == 0){
        "Fizzbuzz"
    }
 }

 def fizz(Integer number){
    if (number % 5 == 0){
        "Fizz"
    }
    else{
        false
    }
 }

 def buzz(Integer number){
    if (number % 3 == 0){
        "Buzz"
    }
    else{
      false
    }
 }

}