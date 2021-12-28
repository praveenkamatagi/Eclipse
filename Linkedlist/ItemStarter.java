package com.xworkz.Linkedlist;
import com.xworkz.Linkedlist.Movie;

public class ItemStarter {
	public static void main(String[] args) {
		item s=new ItemContainer();
		Movie ref=new Movie("lovemocktail", 2020, 4.8, "Kannada");
		Movie ref1=new Movie("Suryavamshi", 2020, 4.8, "Hindi");
		Movie ref2=new Movie("mca", 2018, 4.8, "Telgu");
		Movie ref3=new Movie("master", 2020, 4.8, "Tamil");
		
		s.addItem(ref);
		s.addItem(ref1);
		s.addItem(ref2);
		s.addItem(ref3);
		
		s.displayItem();

		Movie ref4 = new Movie("inspectorvikram", 2020, 4, "kannada");
		Movie ref5 = new Movie("krish2", 2015, 5, "hindi");
		Movie ref6 = new Movie("u turn", 2019, 5, "kannada");
		Movie ref7 = new Movie("super30", 2018, 4, "hindi");
		
		s.addFirstItem(ref1);

		s.getFirstItem ();

	s.addLastItem(ref2);

		s.deleteFirstItem();

		s.displayItem();

		s.addLastItem(ref3);

		s.addLastItem(ref4);

		s.deleteLastItem();

	s.addFirstItem(ref5);

	s.getFirstItem();
	}
	
	}
	


