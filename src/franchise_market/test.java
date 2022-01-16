package franchise_market;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//items testing 
		items su1L = new items("su 1 litre", 150, 1.25, 686969); //constructor
		items eggs = new items("eggs", 100, 3.35, 0);
		items juice = new items("juice", 150, 2.75, 0);
		
		items pen = new items("kalem", 100, 1.75, 2434545);
		items mask = new items("12.mask", 150, 3.75, 23233455);
		items sanitizer = new items("sanitizer", 150, 5.45, 232345);
		items tea = new items("32.tea", 150, 2.5, 8767540);
		
		items usb = builder.eItem("usb", 100, 3.50, 34123444); 
		
		
		
		//System.out.println("\n\n");
		//branch testing
		BRANCH branch1 = new BRANCH ("kadikoySt"); //create
		BRANCH branch2 = new BRANCH ("GoztepeSt");
	
		branch1.getStock().add(su1L); //listing 
		branch1.getStock().add(eggs); //more items
		branch1.getStock().add(juice);// to stock
		branch1.getStock().add(pen);
		branch1.getStock().add(sanitizer);
		branch1.getStock().add(usb);
		branch1.getStock().add(mask);

		
		branch1.setSellsVolume(5000.00); //what has been sold this day 
	
		//toString in for loop
		System.out.println("items list at branch1:"); //toString
		for (int i=0; i<branch1.getStock().size(); i++) {
			System.out.println("--"+(branch1.getStock().get(i)).toString() );
		}
		
		//branch1.stock.forEach(System.out::println); //lamda for the above loop
		
		
		cashier cashier1 =new cashier ("Lisa", 23652763); //constructor
		cashier cashier2 =new cashier ("Jane", 23652566);
		cashier cashier3 =builder.femaleCashier("Ana", 23655661); //builder design pattern
		cashier cashier4 =builder.maleCashier("Adam", 24452760) ;
		cashier cashier5 =builder.maleCashier("John",23574755) ;
				
		
		branch1.getCashiers().add(cashier1);
		System.out.println(cashier1.toString()); //toString
		//total stockSize method	
		
		
		int x=cashier1.getStockSize(branch1);
		System.out.println("\n\ntotal stock size at branch1: "+x);
		
		
		//cashier sells...  (2 x su 1 lt & 1 X "eggs")
		System.out.println("sellsVol B4: $"+branch1.getSellsVolume());
		
		System.out.println("\n*first check out about to start");
		branch1.getCart().add(su1L);
		branch1.getCart().add(eggs);
		branch1.getCart().add(su1L); //by double scanning, one can get one product en-masse
		cashier1.checkOut(branch1.getCart(), branch1); //check out 1
		
		//total stockSize method		
		x=cashier1.getStockSize(branch1);
		System.out.println("\n\ntotal stock size at branch1: "+x);
		System.out.println("sellsVol B4: $"+branch1.getSellsVolume());

		
		//let's create  new cart for new check out 2
		System.out.println("\n*new items in the cart");
		System.out.println("second check out...");
		
		branch1.getCart().clear(); //clear () the cart for a new transaction
		branch1.getCart().add(juice);
		branch1.getCart().add(su1L);
		cashier1.checkOut(branch1.getCart(), branch1); //check out 2
		
		//total stockSize method		
		x=cashier1.getStockSize(branch1);
		System.out.println("\n\ntotal stock size at branch1: "+x);	
		
		System.out.println("\n*after sells the total sellsVol changes");
		System.out.println("sellsVol now: $"+branch1.getSellsVolume());
		
		
		//items testing in-stock after check out
		System.out.println("\nitems testing in-stock after check out");
		for (int i=0; i<branch1.getStock().size();i++) {
				System.out.println("--"+branch1.getStock().get(i).toString()); //toString
		}
		
		
		System.out.println("\n\n");
		//manager and testing managers
		manager manager1 = builder.maleManager("Alex", 46546342);
		manager manager2 =builder.femaleManager("Marie", 28362836);
		
		branch1.setManager(manager1); //set a manager for a branch //assigning directly
		System.out.println(branch1.getManager()); //toString
		
		
		System.out.println("\n\n");
		//testing HQ
		HQ hq = new HQ ("Central Command"); //constructed
	
		System.out.println("*manager changes after employManager method applies");
		System.out.println(branch1.getManager()); 
		hq.employManager(manager2,branch1); 
		System.out.println(branch1.getManager());
		
		
		System.out.println("\n\n");
		//HQ employing cashiers en-masse
		System.out.println("*HQ employing cashiers en-masse");
		hq.employCashier(cashier2, branch1);
		hq.employCashier(cashier3, branch1);
		hq.employCashier(cashier4, branch1);
		hq.employCashier(cashier5, branch1);
		
		branch1.getCashiers().forEach(System.out::println); //newly hired employees
		
		//HQ firing cashiers...
		System.out.println("\n\n*cashier(s) is getting fired");
		hq.fireCashier(cashier4, branch1);
		branch1.getCashiers().forEach(System.out::println); //checking the left employees 
		
		//fired empolyees are...
		System.out.println("\n*fired cashiers...");
		branch1.getFiredEmployees().forEach(System.out::println);
		
		//let's fire the manager
		System.out.println("\n\n*the manager is getting sacked...");
		System.out.println(branch1.getManager());
		hq.fireManager(manager2, branch1);
		System.out.println(branch1.getManager());
		
		//so let's get a new manager right
		System.out.println("\n*getting a new manager...");
		hq.employManager(manager1, branch1);
		System.out.println(branch1.getManager());
		
		
		
		//testing the intern(exchange) program
		System.out.println("\n\n*testing the intern(exchange) program");
		branch1.getInterns_outgoing().add(cashier5); //sent two cashiers to branch2
		branch1.getInterns_outgoing().add(cashier1);
		
		branch2.getInterns_incoming().forEach(System.out::println);
		manager1.sendInterns_OPEN(branch2, branch1.getInterns_outgoing());
		branch2.getInterns_incoming().forEach(System.out::println);
		
		
		
		
		
		
		
	}

}
