package com.xworkz.customException.TheaterException;

import com.xworkz.customException.Theater.Theater;
import com.xworkz.customException.Theater.TicketType;

public class TheaterStarter {
	public static void main(String[] args) {
		
	
	Theater theater = new Theater("GGVV");
	theater.bookTicket("GGVV",TicketType.Ghandi_class, 4);
	theater.bookTicket("GGVV",TicketType.MiddleClass, 4);
	theater.bookTicket("GGVV",TicketType.Balcony, 4);
	System.out.println("intellegent movie");
}

}