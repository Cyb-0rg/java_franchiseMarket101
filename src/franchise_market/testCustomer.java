package franchise_market;

import java.util.ArrayList;
import java.util.Scanner;

public class testCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		items su1L = new items("su 1 litre", 150, 1.25, 686969); //constructor
		items eggs = new items("eggs", 100, 3.35, 132332);
		items juice = new items("juice", 150, 2.75, 1324234);
		items pen = new items("kalem", 100, 1.75, 2434545);
		items mask = new items("12.mask", 150, 3.75, 23233455);
		items sanitizer = new items("sanitizer", 150, 5.45, 232345);
		items tea = new items("32.tea", 150, 2.50, 8767540);
		
		items usb = builder.eItem("usb", 100, 3.50, 34123444); //electronics item




		
		
		BRANCH branch1 = new BRANCH ("kadikoySt"); //create
		
	
		branch1.getStock().add(su1L); //listing 
		branch1.getStock().add(eggs); //more items
		branch1.getStock().add(juice);// to stock
		branch1.getStock().add(pen);// to stock
		branch1.getStock().add(mask);// to stock
		branch1.getStock().add(sanitizer);// to stock
		branch1.getStock().add(tea);// to stock
		branch1.getStock().add(usb);// to stock

		
		branch1.setSellsVolume(5000.00); //what has been sold this day 
		
		
		
		
		
		
		
		
		System.out.println("*************************************************");
		System.out.println("*************************************************");
		
		System.out.println("\nbranch 1'deki urunlerin listesi soyle:");
		for (int i=0; i<branch1.getStock().size();i++) {
			System.out.println((i)+". "+ branch1.getStock().get(i));
		}
		
		System.out.println("\n*************************************************");
		System.out.println("*************************************************");
		System.out.println("\nalmak istegin urunleri seciniz...sonra -1 tiklayiniz");
		
		Scanner keyboard= new Scanner(System.in);
		System.out.println("\n");
		int x= keyboard.nextInt();
		double total=0;
		
		ArrayList <items> cart =new ArrayList<>();
		try {
		while (x!=-1) {
			total+=branch1.getStock().get(x).getPrice();
			System.out.println(branch1.getStock().get(x).getNameOfProduct());
			cart.add(branch1.getStock().get(x));
			System.out.println("total=$"+total);
			x= keyboard.nextInt();
		}
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println("urun bulunamandi");
		}
		System.out.println("\n\n\n*******reciept*********");
		for (int i =0; i<cart.size();i++) {
			
			System.out.println(cart.get(i).getNameOfProduct() + " ..... " + cart.get(i).getPrice());
		}
		System.out.println("\ntotal=$"+total);
		System.out.println("\n*************************");
		
		
		

	}
	

}
