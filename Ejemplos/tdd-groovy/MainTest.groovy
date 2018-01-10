class MainTest extends GroovyTestCase{

  void testOne(){
    //given:"an invoice object"
    Invoice factura = new Invoice()
    //When
    //Then
    assert factura != null
  }

  void testTwo(){
    //Given: "An entity"
    Entity emissor = new Entity()
    //when
    emissor.businessName = "Making Devs SC"
    emissor.rfc = "PASC940612"
    //then
    assert emissor.businessName == "Making Devs SC"
    assert emissor.rfc == "PASC940612"
    assert emissor.rfc != "!!PASC940612"
  }

  void testThree(){
    //given:a concept
    Concept c1 = new Concept(sizes:5, description:"Coca", price:15.3)
    //when: I want to know the import price
    def importPrice = c1.getImportPrice()
    //then
    assert importPrice == 76.5
  }

  void testFour(){
    //Given:

    Entity emissor = new Entity(businessName:"MakingDevsEmissor", rfc:"PASC")
    Entity receiver = new Entity(businessName:"MakingDevsReceiver", rfc:"PASC")

    Concept c1 = new Concept(sizes:1, description:"Coca", price:15.3)
    Concept c2 = new Concept(sizes:2, description:"Tachas", price:5.7)
    Concept c3 = new Concept(sizes:3, description:"Perico", price:20.3)

    Invoice factura = new Invoice()
    factura.emissor = emissor
    factura.receiver = receiver
    factura.concepts = [c1,c2,c3]

    assert factura.emissor.businessName == "MakingDevsEmissor"
    assert factura.receiver.businessName == "MakingDevsReceiver"
    assert factura.importBeforeTax() == 87.6
    assert factura.importWithTax() == 101.616

  }

  void testFive(){
    //given: "A database resultset for invoice"
    Map resultSet = [emissor_name:"makingdevs", receiver_name:"makingdevs"]

    //When:I want to receive the object invoice
    InvoiceParserService parser = new InvoiceParserService()
    def invoice = parser.getInvoice(resultSet)

    assert invoice.emissor.businessName == "makingdevs"
    assert invoice.receiver.businessName == "makingdevs"
  }

}
