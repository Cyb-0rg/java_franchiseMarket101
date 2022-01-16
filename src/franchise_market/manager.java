package franchise_market;

import java.util.ArrayList;

public class manager extends employees{

	public manager(String name, long iD_No) {
		super(name, iD_No);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "manager [name=" + getName() + ", ID_No=" + getID_No() + "]";
	}


	
	//METHODS
	//Receive items from HQ
	
	void recieveItems(ArrayList<items> lists, BRANCH branch) {
		
		for (int i=0; i<lists.size(); i++) {
			branch.getStock().add(lists.get(i));
			
			
		}
		
		
	}

	@Override
	public void sendInterns_OPEN(BRANCH branch_recieving, ArrayList<employees> interns_outgoing) {
		
		branch_recieving.getInterns_incoming().clear();
		branch_recieving.getInterns_incoming().addAll(interns_outgoing); 
	}
	
	
	@Override
	public void sendInterns_APPEND(BRANCH branch_recieving, ArrayList <employees> interns_outgoing) {
		
		//branch_recieving.interns_incoming.clear();
		branch_recieving.getInterns_incoming().addAll(interns_outgoing); 
	}


	@Override
	public void fireCashier(cashier cashier, BRANCH branch) {
		// TODO Auto-generated method stub
		branch.getFiredEmployees().add(cashier);
		branch.getCashiers().remove(cashier); 
		
	}

	@Override
	public cashier employCashier(cashier cashier, BRANCH branch) {
		// TODO Auto-generated method stub
		
		//managers are not supposed to employ cashiers by themselves
		return null;
	}




	
	

}
