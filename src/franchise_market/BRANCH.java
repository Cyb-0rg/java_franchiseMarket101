package franchise_market;

import java.util.ArrayList;

public class BRANCH {
	
	      /// ATTRIBUTES
	
	private double sellsVolume; //24hr track of sells vol.
	private String name;
	private manager manager;
	private int stockSize; //for loop of stock(i) * stock(i).Quantity
	
	private ArrayList <employees> firedEmployees = new ArrayList<>(); //fired employees saved here
	private ArrayList <employees> interns_outgoing = new ArrayList <>(); //intern cashiers ArrayList ; for training purposes
	private ArrayList <employees> interns_incoming = new ArrayList <>();  
	
	
	private ArrayList <cashier> cashiers = new ArrayList<>(); //since there is always more than one cashier in store
	
	private ArrayList <items> stock = new ArrayList<>();  //collects items and forms a list
	private ArrayList <items> cart = new ArrayList<>();   //group of items a customer wants to buy
	
	public BRANCH(String name) {
		
		this.name = name;
	}

	public double getSellsVolume() {
		return sellsVolume;
	}

	public void setSellsVolume(double sellsVolume) {
		this.sellsVolume = sellsVolume;
	}

	public manager getManager() {
		return manager;
	}

	public void setManager(manager manager) {
		this.manager = manager;
	}

	public int getStockSize() {
		return stockSize;
	}

	public void setStockSize(int stockSize) {
		this.stockSize = stockSize;
	}

	public ArrayList <employees> getFiredEmployees() {
		return firedEmployees;
	}

	public void setFiredEmployees(ArrayList <employees> firedEmployees) {
		this.firedEmployees = firedEmployees;
	}

	public ArrayList <employees> getInterns_outgoing() {
		return interns_outgoing;
	}

	public void setInterns_outgoing(ArrayList <employees> interns_outgoing) {
		this.interns_outgoing = interns_outgoing;
	}

	public ArrayList <employees> getInterns_incoming() {
		return interns_incoming;
	}

	public void setInterns_incoming(ArrayList <employees> interns_incoming) {
		this.interns_incoming = interns_incoming;
	}

	public ArrayList <items> getStock() {
		return stock;
	}

	public void setStock(ArrayList <items> stock) {
		this.stock = stock;
	}

	public ArrayList <cashier> getCashiers() {
		return cashiers;
	}

	public void setCashiers(ArrayList <cashier> cashiers) {
		this.cashiers = cashiers;
	}

	public ArrayList <items> getCart() {
		return cart;
	}

	public void setCart(ArrayList <items> cart) {
		this.cart = cart;
	}
	
	

}
