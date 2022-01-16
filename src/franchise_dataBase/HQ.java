package franchise_dataBase;

import java.util.ArrayList;

public class HQ implements shared_authorities{

	String name;
	int NumberOfEmployees;
	ArrayList <items> HQitemList = new ArrayList<>(); 
	
	
	public HQ(String name) {
		
		this.name = name;
	}
	
	
	
	//methods
	
	//employ : manager && cashier
	//fire : manager && cashier
	
	@Override
	public String toString() {
		return "HQ [name=" + name + ", NumberOfEmployees=" + NumberOfEmployees + "]";
	}



	manager employManager(manager manager, BRANCH branch) {
		
		branch.manager= manager;
		return manager;
	} 
	
	
	public cashier employCashier(cashier cashier, BRANCH branch) {
		
		branch.cashiers.add(cashier);
		return cashier;
	}
	
	manager fireManager(manager manager, BRANCH branch) {
		
		branch.manager= null;
		return null;
	}
	
	public void fireCashier(cashier cashier, BRANCH branch) {
		
		branch.cashiers.remove(cashier) ;
		branch.firedEmployees.add(cashier);
		 
	}
	
	
	public void sendInterns_OPEN(BRANCH branch_recieving, ArrayList <employees> interns_outgoing) {
		
		branch_recieving.interns_incoming.clear();
		branch_recieving.interns_incoming.addAll(interns_outgoing); 
	}
	
	public void sendInterns_APPEND(BRANCH branch_recieving, ArrayList <employees> interns_outgoing) {
		
		//branch_recieving.interns_incoming.clear();
		branch_recieving.interns_incoming.addAll(interns_outgoing); 
	}



	@Override
	public int getStockSize(BRANCH branch) {
		// TODO Auto-generated method stub
		
		for (int i =0; i<branch.stock.size();i++) {
			branch.stockSize+= branch.stock.get(i).Quantity;
		}
		
		return branch.stockSize;
	}
	
	
	
	

}
