package franchise_market;

public class items {
	
	///ATTRIBUTES
	
	private String nameOfProduct;
	private int Quantity;
	private double price;
	private long barCode;
	
	private boolean isElectronic;

	public boolean isElectronic() {
		return isElectronic;
	}

	public void setElectronic(boolean isElectronic) {
		this.isElectronic = isElectronic;
	}

	public items(String nameOfProduct, int quantity, double price, long barCode) {
		
		this.nameOfProduct = nameOfProduct; 
		this.setQuantity(quantity);
		this.setPrice(price);
		this.barCode = barCode;
	}

	@Override
	public String toString() {
		return "items [nameOfProduct=" + nameOfProduct + ", Quantity=" + getQuantity() + ", price=" + getPrice() + ", barCode="
				+ barCode + "]";  
	}

	public String getNameOfProduct() {
		return nameOfProduct;
	}

	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}


	
	

}
