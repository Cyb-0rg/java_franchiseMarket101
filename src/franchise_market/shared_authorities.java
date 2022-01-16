package franchise_market;

import java.util.ArrayList;

interface shared_authorities {
	//power shared between managers and the HQ
	
	
	void sendInterns_APPEND(BRANCH branch_recieving, ArrayList <employees> interns_outgoing);
	void sendInterns_OPEN(BRANCH branch_recieving, ArrayList <employees> interns_outgoing);
	
	cashier employCashier(cashier cashier, BRANCH branch) ;
	void fireCashier(cashier cashier, BRANCH branch);
	
	int getStockSize(BRANCH branch); //for cashiers, managers and HQ
	

}
