class Person{
  def name
  def email

  def getName(){
    return this.name
  }

  def setName(){
    this.name = name
  }

  def getEmail(){
    return this.email
  }

  def setEmail(){
    this.email = email
  }

}

//Creando una nueva variable de instancia de la clase Persona
def david = new Person( name: 'David', email: 'david@makingdevs.com')

//Cambiando el correo
david.setEmail('davy@perro.com')

println david.getName()
println david.getEmail()


