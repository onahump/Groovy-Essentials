// Invoice Parser

class InvoiceParserTest extends GroovyTestCase{

  def parser = new InvoiceParser()

  //Method for parse a xml file
  void testOne(){
    parser.buildXml("archivo.xml",'http://www.sat.gob.mx/cfd/3')
    assert parser.xml
  }

  //Method for get the invoice concepts
  void testTwo(){
    parser.buildXml("archivo.xml",'http://www.sat.gob.mx/cfd/3')
    assert parser.getConcepts().size() == 2

  }

  //Method for test generateInvoice for get a invoice object
  void testThree(){
    parser.buildXml("archivo.xml",'http://www.sat.gob.mx/cfd/3')
    def invoice = parser.generateInvoice()
    assert invoice.concepts.size() == 2
  }

  void testFour(){
    parser.buildXml("archivo.xml",'http://www.sat.gob.mx/cfd/3')
    def invoice = parser.generateInvoice()
    assert invoice.receiver.name == "MAKING DEVS SC"
  }

}
