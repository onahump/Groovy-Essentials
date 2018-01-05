
class TestAdventOfCode2 extends GroovyTestCase{

  def helper = new Helper()

  void testOne(){
    assert helper.exactlyPaperElvesNeed("2x3x4") == [2,3,4]
  }
}


class Helper{
  def exactlyPaperElvesNeed(def numbers){

  def splitingNumbers = numbers.split('x')
  splitingNumbers = splitingNumbers.toInteger()
  return splitingNumbers
  }
}

