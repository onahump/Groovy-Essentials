/*Invoice*/
class InvoiceParser{

  //There are the attributes for you InvoiceParser
  def xml
  def invoiceConcepts = [:]

  //Method testes in testOne
  def buildXml(String xmlFilePath, String cfdi){
    def xml = new XmlSlurper().parse(xmlFilePath)
    xml.declareNamespace(cfdi:cfdi)
    this.xml = xml
  }

  //Method tested in testTwo
  def getConcepts(){
    xml.Conceptos.'cfdi:Concepto'.each{
      invoiceConcepts.put(it.'@descripcion',it.'@importe'.toString())
    }
    invoiceConcepts
  }

  //Method tested in testThree
  Invoice generateInvoice(){
    Invoice invoice = new Invoice()
    invoice.concepts = getConcepts()

    //Generating new domain for receiver
    Receiver receiver = new Receiver()
    receiver.name = xml.Receptor[0]['@nombre'].toString()
    receiver.rfc = xml.Receptor[0]['@rfc'].toString()

    invoice.receiver = receiver

    invoice
  }


}

//domain class invoice getting in testThree
class Invoice {
  Map concepts
  Receiver receiver
}

class Receiver {
  String name
  String rfc
}
