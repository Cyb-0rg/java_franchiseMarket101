package franchise_market;

public class builder {
	
	
	static cashier maleCashier(String name, long iD_No) {
		cashier c = new cashier(name, iD_No);
		c.setMale(true);
		
		return c;
		
	}
	
	static cashier femaleCashier(String name, long iD_No) {
		cashier c = new cashier(name, iD_No);
		c.setMale(false);
		
		return c;
		
	}
	static manager maleManager(String name, long iD_No) {
		manager m = new manager(name, iD_No);
		m.setMale(true);
		
		return m;
		
	}
	
	static manager femaleManager(String name, long iD_No) {
		manager m = new manager(name, iD_No);
		m.setMale(false);
		
		return m;
		
	}
	
	
	//let's add different methods that would create items diffntly
	
	static items eItem(String nameOfProduct, int quantity, double price, long barCode) {
		items c = new items(nameOfProduct, quantity, price, barCode);
		c.setElectronic(true);
		
		return c;
		
	}
	

	
	

}
