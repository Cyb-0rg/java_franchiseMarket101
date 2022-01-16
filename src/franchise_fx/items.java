package franchise_fx;

public class items {
	
	///ATTRIBUTES
	
	String nameOfProduct;
	int Quantity;
	double price;
	long barCode;

	public items(String nameOfProduct, int quantity, double price, long barCode) {
		
		this.nameOfProduct = nameOfProduct; 
		this.Quantity = quantity;
		this.price = price;
		this.barCode = barCode;
	}

	@Override
	public String toString() {
		return "items [nameOfProduct=" + nameOfProduct + ", Quantity=" + Quantity + ", price=" + price + ", barCode="
				+ barCode + "]"; 
	}


	
	

}
