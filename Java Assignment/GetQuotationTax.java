package dealership;

public class GetQuotationTax extends GetQuotation {
	double price;
	String cname;
	double quotation;
	// tax = 10%
	public double getQuotation() {
	this.quotation = 1.1 * this.price;
	return this.quotation;
}
}