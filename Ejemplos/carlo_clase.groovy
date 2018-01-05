class Invoice {
  List<Concept> concepts = []
  Receiver receiver
  Emissor emissor
  Direction direction 
}

class Direction{
    //Boolean type 
    String street
}

class Concept{
    String name
    Integer price
}

class Receiver {
  String name
  String rfc
  Direction direction
  //direction
}

class Emissor{
    String name
    String rfc
    Direction direction
    //direccion
}

println "Hola inmundo"

Invoice factura = new Invoice()
factura.concepts = [1,"hola"]

Receiver receptor = new Receiver()
receptor.name = "nahump"
receptor.rfc = "PASC940613"


Concept concepto1 = new Concept()
concepto1.name = "Concept1"
concepto1.price = 10
Concept concepto2 = new Concept()
concepto2.name = "Concept1"
concepto2.price = 10
Concept concepto3 = new Concept()
concepto3.name = "Concept1"
concepto3.price = 10

factura.receiver = receptor

Direction emissorDirection = new Direction()
emissorDirection.street = "Calle de un emissor"

Direction receiverDirection = new Direction()
receiverDirection.street = "Calle de un receiver"

receptor.direction = receiverDirection

receptor.direction.street