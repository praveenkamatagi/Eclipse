import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MobileRunner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Mobile mobile= new Mobile();
		System.out.println("enter mob company name ");
		String company=scanner.next();
		 mobile.setCompany(company); 
		System.out.println("chargr type ");
		String charger=scanner.next();
		mobile.setCharger(charger);
		System.out.println("enter ram");
		int ram=scanner.nextInt();
		mobile.setRam(ram);
		System.out.println("enter price");
		double price=scanner.nextDouble();
		mobile.setPrice(price);
		System.out.println(" pr0cessor type");
		String p=scanner.next();
		mobile.setProcessor(p);
		
				
		Collection collection= new ArrayList();
		collection.add(company);
		collection.add(charger);
		collection.add(ram);
		collection.add(price);
		collection.add(p);
		System.out.println(collection);
		

		Collection collection1=new ArrayList();
	
		collection1.add("Belagavi");
		collection1.add("Hubli");
		collection1.add(true);
		collection1.add(100);
		collection1.add(1.8);
		collection1.add("shivamoga");
		
		int s=collection.size();
		System.out.println(s);
		System.out.println(collection);
		System.out.println(collection.isEmpty());
		if (collection.contains("Belagavi")) {
			System.out.println("yes present");
			
		} else {
			System.out.println(" not present");
		}
		collection.remove("Hubli");
		System.out.println(collection1);
	

	Collection collection2 =new ArrayList();

	collection2.add("banglore");
	collection2.add("manglore");
	collection2.add("mysore");
	System.out.println(collection2);
	
	collection2.addAll(collection);
	System.out.println(collection2);
	
	
	System.out.println(collection.containsAll(collection2));
	System.out.println(collection.retainAll(collection2));
	System.out.println(collection);
	System.out.println(collection2.retainAll(collection));
	System.out.println(collection2);
	 
	collection.clear();
	System.out.println(collection);
	}
}

