package franchise_market;

import java.util.ArrayList;

public class HQ implements shared_authorities{

	private String name;
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}



	public void setNumberOfEmployees(int numberOfEmployees) {
		NumberOfEmployees = numberOfEmployees;
	}



	public ArrayList<items> getHQitemList() {
		return HQitemList;
	}



	public void setHQitemList(ArrayList<items> hQitemList) {
		HQitemList = hQitemList;
	}



	private int NumberOfEmployees;
	private ArrayList <items> HQitemList = new ArrayList<>(); 
	
	
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
		
		branch.setManager(manager);
		return manager;
	} 
	
	
	public cashier employCashier(cashier cashier, BRANCH branch) {
		
		branch.getCashiers().add(cashier);
		return cashier;
	}
	
	manager fireManager(manager manager, BRANCH branch) {
		
		branch.setManager(null);
		return null;
	}
	
	public void fireCashier(cashier cashier, BRANCH branch) {
		
		branch.getCashiers().remove(cashier) ;
		branch.getFiredEmployees().add(cashier);
		 
	}
	
	
	public void sendInterns_OPEN(BRANCH branch_recieving, ArrayList <employees> interns_outgoing) {
		
		branch_recieving.getInterns_incoming().clear();
		branch_recieving.getInterns_incoming().addAll(interns_outgoing); 
	}
	
	public void sendInterns_APPEND(BRANCH branch_recieving, ArrayList <employees> interns_outgoing) {
		
		//branch_recieving.interns_incoming.clear();
		branch_recieving.getInterns_incoming().addAll(interns_outgoing); 
	}



	@Override
	public int getStockSize(BRANCH branch) {
		// TODO Auto-generated method stub
		branch.setStockSize(0);
		for (int i =0; i<branch.getStock().size();i++) {
			branch.setStockSize(branch.getStockSize() + branch.getStock().get(i).getQuantity());
		}
		
		return branch.getStockSize(); 
	}
	
	
	
	

}
