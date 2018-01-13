@GrabConfig(systemClassLoader=true)
@Grab(group='mysql', module='mysql-connector-java', version='5.1.6')

import groovy.sql.Sql

db = [user:"root", pass:'makingdevs',url:'jdbc:mysql://localhost/facturas', driver:'com.mysql.jdbc.Driver']
def sql = Sql.newInstance(db.url, db.user, db.pass, db.driver)

empresas = []
listadeempresas = []
sql.eachRow('select * from invoice_entity'){
    def ie = new InvoiceEntity(razonSocial:it.razon_social, rfc:it.rfc)
    empresas << ie
    listadeempresas << [razonSocial:it.razon_social, rfc:it.rfc]
}
println empresas 
println listadeempresas 