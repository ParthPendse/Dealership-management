package dealership;
import java.io.Serializable;



public class Car implements Serializable {
	public static final long serialVersionUID = 42L;
	double price;
	String cname;
	double quotation;
	Car(){}
	Car(int c_price, String c_name){
		this.price = c_price;
		this.cname = c_name;
		
	}
	public double getQuotationTax() {
		// tax = 10%
		this.quotation = 1.1 * this.price;
		return this.quotation;
	}
	public double getQuotationGST() {
		 
		//GST = 15%
		this.quotation = 1.15 * this.price;
		return this.quotation;
	}

}
