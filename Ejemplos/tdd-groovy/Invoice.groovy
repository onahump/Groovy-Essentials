class Invoice{

  Entity emissor
  Entity receiver
  List<Concept> concepts
  BigDecimal total
  BigDecimal totalWithTax

  def importBeforeTax(){
    this.total = concepts.collect{ concept ->
      concept.importPrice
    }.sum()
  }

  def importWithTax(){
    this.totalWithTax = total + (total*0.16)
  }


}
