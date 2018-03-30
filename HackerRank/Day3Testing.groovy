
class Day3Testing extends GroovyTestCase{

  def helper = new Helper()

  void testOne(){
    assert helper.isEvenAndIsEvenGreaterThanTwenty(2) == "Not Weird"
  }

  void testTwo(){
    assert helper.isOddOrEvenBetweenSixTwenty(1) == "Weird"
  }

  void testThree(){
    assert helper.isOddOrEvenBetweenSixTwenty(6) == "Weird"
  }

  void testFour(){
    assert helper.isEvenAndIsEvenGreaterThanTwenty(22) == "Not Weird"
  }
}

class Helper{

  def isEvenAndIsEvenGreaterThanTwenty(Integer number){
     def numberEven = ((number % 2 == 0) && (number <=5 || number >20)) ? "Not Weird": "Weird"
  }

  def isOddOrEvenBetweenSixTwenty(Integer number){
    def numberOdd = (!(number % 2 == 0) ||  ((number % 2 == 0) && (number>=6 && number<=20)) ) ? "Weird" : "Not Weird"
  }
}
