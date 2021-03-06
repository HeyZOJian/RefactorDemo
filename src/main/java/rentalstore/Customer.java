package rentalstore;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String name;
	private Vector rentals = new Vector();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	}

	public String getName() {
		return name;
	}

	public String getTxtStatement() {
		return new TxtStatement(rentals,getName()).getValue();
	}

	public String getHtmlStatement(){
		return new HtmlStatement(rentals,getName()).getValue();
	}

}
