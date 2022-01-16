package franchise_market;

import java.util.ArrayList;

public abstract class employees implements shared_authorities{

	//ATTRIBUTES
	
	private String  name;
	private long ID_No;
	private boolean isMale;
	
	public employees(String name, long iD_No) {
		
		this.setName(name); 
		this.setID_No(iD_No);
	}
	
	//may be try adding the check out method as an inherited one
	void checkOut(ArrayList <items> cart, BRANCH branch) {
		double total = 0;
		
		for (int i=0; i<cart.size(); i++) { 
			System.out.println((cart.get(i)).toString() );
			
			total += cart.get(i).getPrice();
			branch.getStock().get(i).setQuantity(branch.getStock().get(i).getQuantity() - 1);
		}
		
		branch.setSellsVolume(branch.getSellsVolume() + total);
		System.out.println("total: $"+total);
		
		
		
	}
	
	public int getStockSize(BRANCH branch) {
		branch.setStockSize(0);
		for (int i =0; i<branch.getStock().size();i++) {
			branch.setStockSize(branch.getStockSize() + branch.getStock().get(i).getQuantity());
		}
		
		return branch.getStockSize();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getID_No() {
		return ID_No;
	}

	public void setID_No(long iD_No) {
		ID_No = iD_No;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	
}
