package franchise_fx;

import java.util.ArrayList;

public abstract class employees implements shared_authorities{

	//ATTRIBUTES
	
	String  name;
	long ID_No;
	
	
	public employees(String name, long iD_No) {
		
		this.name = name; 
		this.ID_No = iD_No;
	}
	
	//may be try adding the check out method as an inherited one
	void checkOut(ArrayList <items> cart, BRANCH branch) {
		double total = 0;
		
		for (int i=0; i<cart.size(); i++) { 
			System.out.println((cart.get(i)).toString() );
			
			total += cart.get(i).price;
			branch.stock.get(i).Quantity-=1;
		}
		
		branch.sellsVolume+=total;
		System.out.println("total: $"+total);
		
		
		
	}
	
	public int getStockSize(BRANCH branch) {
		for (int i =0; i<branch.stock.size();i++) {
			branch.stockSize+= branch.stock.get(i).Quantity;
		}
		
		return branch.stockSize;
		
	}
	
	
}
