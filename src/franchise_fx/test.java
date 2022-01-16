package franchise_fx;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//items testing 
		items su1L = new items("su 1 litre", 150, 1.25, 686969); //constructor
		items none = new items("eggs", 100, 3.35, 0);
		items none2 = new items("juice", 150, 2.75, 0);
		System.out.println(su1L.toString()); //toString
		
		
		System.out.println("\n\n");
		//branch testing
		BRANCH branch1 = new BRANCH ("kadikoySt"); //create
		BRANCH branch2 = new BRANCH ("GoztepeSt");
	
		branch1.stock.add(su1L); //listing 
		branch1.stock.add(none); //more items
		branch1.stock.add(none2);// to stock
		
		branch1.sellsVolume= 5000.00; //what has been sold this day
		
		//toString in for loop
		for (int i=0; i<branch1.stock.size(); i++) {
			System.out.println((branch1.stock.get(i)).toString() );
		}
		
		//branch1.stock.forEach(System.out::println); //lamda for the above loop
		
		
		System.out.println("\n\n");
		//cashier testing 
		
		cashier cashier1 =new cashier ("Lisa", 23652763); //constructor
		cashier cashier2 =new cashier ("Lisa2", 23652566);
		cashier cashier3 =new cashier ("Lisa3", 23655661);
		cashier cashier4 =new cashier ("Lisa4", 24452760);
		cashier cashier5 =new cashier ("Lisa5", 23574755);
		
		branch1.cashiers.add(cashier1);
		System.out.println(cashier1.toString()); //toString
		
		//cashier sells...  (2 x su 1 lt & 1 X "none")
		System.out.println("sellsVol B4: $"+branch1.sellsVolume);
		
		System.out.println("\n*first check out about to start");
		branch1.cart.add(su1L);
		branch1.cart.add(none);
		branch1.cart.add(su1L); //by double scanning, one can get one product en-masse
		cashier1.checkOut(branch1.cart, branch1); //check out 1

		
		//let's create  new cart for new check out 2
		System.out.println("\n*new items in the cart");
		System.out.println("second check out...");
		
		branch1.cart.clear(); //clear () the cart for a new transaction
		branch1.cart.add(none2);
		branch1.cart.add(su1L);
		//cashier1.checkOut(branch1.cart, branch1); //check out 2
		
		//total stockSize method		
		int x=cashier1.getStockSize(branch1);
		System.out.println("\n\ntotal stock size at branch1: "+x);	
		
		System.out.println("\n*after sells the total sellsVol changes");
		System.out.println("sellsVol now: $"+branch1.sellsVolume);
		
		
		//items testing in-stock after check out
		System.out.println("\nitems testing in-stock after check out");
		for (int i=0; i<branch1.stock.size();i++) {
				System.out.println(branch1.stock.get(i).toString()); //toString
		}
		
		
		System.out.println("\n\n");
		//manager and testing managers
		manager manager1 =new manager("Alex", 28362836);
		manager manager2 =new manager("Marie", 28362836);
		branch1.manager= manager1; //set a manager for a branch //assigning directly
		System.out.println(branch1.manager); //toString
		
		
		System.out.println("\n\n");
		//testing HQ
		HQ hq = new HQ ("central Command"); //constructed
	
		System.out.println("*manager changes after employManager method applies");
		System.out.println(branch1.manager); 
		hq.employManager(manager2,branch1); 
		System.out.println(branch1.manager);
		
		
		System.out.println("\n\n");
		//HQ employing cashiers en-masse
		System.out.println("*HQ employing cashiers en-masse");
		hq.employCashier(cashier2, branch1);
		hq.employCashier(cashier3, branch1);
		hq.employCashier(cashier4, branch1);
		hq.employCashier(cashier5, branch1);
		
		branch1.cashiers.forEach(System.out::println); //newly hired employees
		
		//HQ firing cashiers...
		System.out.println("\n\n*someone is getting fired oh boii");
		hq.fireCashier(cashier4, branch1);
		branch1.cashiers.forEach(System.out::println); //checking the left employees 
		
		//fired empolyees are...
		System.out.println("\n*fired cashiers...");
		branch1.firedEmployees.forEach(System.out::println);
		
		//let's fire the manager
		System.out.println("\n\n*the manager is getting sacked...");
		System.out.println(branch1.manager);
		hq.fireManager(manager2, branch1);
		System.out.println(branch1.manager);
		
		//so let's get a new manager right
		System.out.println("\n*getting a new manager...");
		hq.employManager(manager1, branch1);
		System.out.println(branch1.manager);
		
		
		
		//testing the intern(exchange) program
		System.out.println("\n\ntesting the intern(exchange) program");
		branch1.interns_outgoing.add(cashier4); //sent two cashiers to branch2
		branch1.interns_outgoing.add(cashier1);
		
		branch2.interns_incoming.forEach(System.out::println);
		manager1.sendInterns_OPEN(branch2, branch1.interns_outgoing);
		branch2.interns_incoming.forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
