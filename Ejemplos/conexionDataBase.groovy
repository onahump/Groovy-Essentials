    import java.sql.*
  @Grab('mysql:mysql-connector-java:5.1.25')
@GrabConfig(systemClassLoader = true)
import groovy.sql.Sql
def nombre = "puto"

try{
  // def sql =  Sql.newInstance("jdbc:mysql://localhost:3306/impulsomx_qa","root","makingdevs", "com.mysql.jdbc.Driver")
  def sql = Sql.newInstance('jdbc:mysql://localhost:3306/prueba', 'root',
  'makingdevs', 'com.mysql.jdbc.Driver')
  def sqlstr = """insert into factura values ('${nombre}')"""
  def data = sql.execute(sqlstr);
  sql.eachRow('select * from factura') {
    tp ->
      println(tp.name)
  }
  println data

}catch(all){
  println "Fallo"
  println all
}