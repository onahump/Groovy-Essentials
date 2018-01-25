//Instanciando las Direcciones del emisor y el receptor

Direccion direccionDelEmisor = new Direccion(
	calle:"Rodolfo Gaona", 
	noExterior:"86",
	noInterior:"E",
	cPostal:"11200",
	colonia:"El Carmen", 
	estado:"CDMX",
	municipio:"Coyoacan",
	pais:"México")

Direccion direccionDelReceptor = new Direccion(
	calle:"Calzada Ermita Iztapalapa",
	noExterior:"278",
	noInterior:"501",
	cPostal:"09470",
	colonia:"Sinatel",
	estado:"CDMX",
	municipio:"Iztapalapa",
	pais:"México")

//Instaciando nuevo emisor

InvoiceEntity emisor = new InvoiceEntity(razonSocial:"LA EUROPEA MEXICO, S.A.P.I DE C.V.",
						   rfc:"EME910610G1A")
emisor.direccion = direccionDelEmisor

InvoiceEntity emisor2 = new InvoiceEntity(razonSocial:"Juan",
						   rfc:"JJAZRE124567")
emisor2.direccion = direccionDelEmisor

//Instanciando nuevo Receptor

InvoiceEntity receptor = new InvoiceEntity(razonSocial:"MAKING DEVS",
								 rfc:"EME910610G1A")
receptor.direccion = direccionDelReceptor

InvoiceEntity receptor2 = new InvoiceEntity(razonSocial:"Pedro",
								 rfc:"PDOANP125563")
receptor2.direccion = direccionDelReceptor

//Instanciando conceptos para cada factura  

Concepto concepto1 = new Concepto(cantidad:1, 
								  descripcion:"Coca-cola 135ml",
								  importe:10.15)
Concepto concepto2 = new Concepto(cantidad:1, 
								  descripcion:"Chetos",
								  importe:12.13)   

Concepto concepto3 = new Concepto(cantidad:1, 
								  descripcion:"Chicles 100g",
								  importe:2.56)
Concepto concepto4 = new Concepto(cantidad:1, 
								  descripcion:"Sabritas Adobadas 250g",
								  importe:6.50)   

def listaDeConceptosFactura1 = [concepto1,concepto2]

def listaDeConceptosFactura2 = [concepto3,concepto4]

//Instanciando la factura numero 1 y agregando elementos a sus atributos"
Factura factura1 = new Factura(emisor:emisor, 
							   receptor:receptor, 
							   conceptos:listaDeConceptosFactura1)

Factura factura2 = new Factura(emisor:emisor2, 
							   receptor:receptor2, 
							   conceptos:listaDeConceptosFactura2)

//listaDeFacturas = [factura1,factura2]

// verificando si existe la base de datos.

//Llamando a yarey 

//ContadorPublico yarey = new ContadorPublico()

//yarey.verificaSiLasTablasExisten()
//Yarey registrame esta factura porfavorzzzzzzz

//yarey.registraLaFactura(factura2)

//Yarey quiero la factura 'X' por favooorzzzzz

//Factura facturaX = yarey.quieroLaFactura(1)
//println facturaX


