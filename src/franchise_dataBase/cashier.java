package franchise_dataBase;

import java.util.ArrayList;

public class cashier extends employees{

	public cashier(String name, long iD_No) {
		super(name, iD_No); 
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "cashier [name=" + name + ", ID_No=" + ID_No + "]";
	}
	
	
	

	//METHODS
	double total=0;


	/*
	 * void checkOut(ArrayList <items> cart, BRANCH branch) { total=0;
	 * 
	 * for (int i=0; i<cart.size(); i++) {
	 * System.out.println((cart.get(i)).toString() );
	 * 
	 * 
	 * total += cart.get(i).price; cart.get(i).Quantity-=1; }
	 * 
	 * branch.sellsVolume+=total; System.out.println("total: $"+total);
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	////////////////////////////////////////////////////////////
	double sellsVolumeCalculator(double sellsVol,double totalb){
		
		return sellsVol+=totalb;
		
	}
	
	void sellsVolCalculator(BRANCH branch,double total) {
		branch.sellsVolume+=total;
	}
	//////////////////////////////////////////////////////////////
	
	
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public void sendInterns_APPEND(BRANCH branch_recieving, ArrayList<employees> interns_outgoing) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendInterns_OPEN(BRANCH branch_recieving, ArrayList<employees> interns_outgoing) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public cashier employCashier(cashier cashier, BRANCH branch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fireCashier(cashier cashier, BRANCH branch) {
		// TODO Auto-generated method stub
		
	}
	

	
	
}
