class InvoiceParserService{

  def getInvoice(Map resultSet){
    Entity emissor = new Entity(businessName:resultSet.emissor_name)
    Entity receiver = new Entity(businessName:resultSet.receiver_name)
    Invoice factura = new Invoice(emissor:emissor, receiver:receiver)
    factura
  }

}
