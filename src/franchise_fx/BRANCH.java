package franchise_fx;

import java.util.ArrayList;

public class BRANCH {
	
	      /// ATTRIBUTES
	
	double sellsVolume; //24hr track of sells vol.
	String name;
	manager manager;
	int stockSize; //for loop of stock(i) * stock(i).Quantity
	
	ArrayList <employees> firedEmployees = new ArrayList<>(); //fired employees saved here
	ArrayList <employees> interns_outgoing = new ArrayList <>(); //intern cashiers ArrayList ; for training purposes
	ArrayList <employees> interns_incoming = new ArrayList <>(); 
	
	
	ArrayList <cashier> cashiers = new ArrayList<>(); //since there is always more than one cashier in store
	
	ArrayList <items> stock = new ArrayList<>();  //collects items and forms a list
	ArrayList <items> cart = new ArrayList<>();   //group of items a customer wants to buy
	
	public BRANCH(String name) {
		
		this.name = name;
	}
	
	

}
