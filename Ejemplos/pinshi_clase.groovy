class Direccion{
    String calle
    Integer numero 
    Integer codigo
    
    String dameTuPincheDireccion(){
        "${calle}, ${numero}, ${codigo}"
    }
}
class Persona {
    String nombre
    Integer edad
    Boolean isPuto
    List<Direccion> direccion = []
     
    def saludar(String nombre){
        println "hola que tal ${nombre}"
    }
}
def tudireccion = new Direccion(calle:"industrial", numero:12, codigo:7710)
def nahump = new Persona(nombre:"Nahump Ponce", edad:24, isPuto:true, direccion:tudireccion)
nahump.saludar("Jorge")
nahump.direccion.dameTuPincheDireccion()
