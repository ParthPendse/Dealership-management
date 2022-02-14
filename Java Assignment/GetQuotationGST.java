package dealership;

public class GetQuotationGST extends GetQuotation {
	double price;
	String cname;
	double quotation;
	public double getQuotation() { 
	//GST = 15%
	this.quotation = 1.15 * this.price;
	return this.quotation;
}
}