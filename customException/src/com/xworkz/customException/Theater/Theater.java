package com.xworkz.customException.Theater;

import com.xworkz.customException.TheaterException.HouseFullRunTimeException;

public class Theater {

	private final int gandhiClassTicket = 5;
	private final int middleClassTicket = 5;
	private final int balconyTicket = 2;
	private String movieName;

	public Theater(String movieName) {
		this.movieName = movieName;
	}

	public boolean bookTicket(String movieName,TicketType ticketType,int totalTickets)
	{
		System.out.println("invoked bookTicket");

		if(movieName.equals(movieName))
		{
			if(TicketType.Ghandi_class.equals(ticketType) && totalTickets<=this.gandhiClassTicket)
			{
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;
			}else
			{
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" ticket is full for ").concat(ticketType.toString()));
				throw new HouseFullRunTimeException("Ghandi class have max five tickets");
			}
		}
		return false;
	}
	
	
	

	public boolean bookTickets(String movieName,TicketType ticketType,int totalTickets)
	{
		System.out.println("invoked bookTicket");

		if(movieName.equals(movieName))
		{
			if(TicketType.MiddleClass.equals(ticketType) && totalTickets<=this.middleClassTicket)
			{
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;
			}else
			{
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" ticket is full for ").concat(ticketType.toString()));
				throw new HouseFullRunTimeException("ticket is max 5 for middle class" );
			}
		}
		return false;
		
		
	}
	public boolean bookTicketss(String movieName,TicketType ticketType,int totalTickets)
	{
		System.out.println("invoked bookTicket");

		if(movieName.equals(movieName))
		{
			if(TicketType.Balcony.equals(ticketType) && totalTickets<=this.balconyTicket)
			{
				System.out.println(this.movieName.concat(" is booked with ").concat(ticketType.toString()));
				return true;
			}else
			{
				System.err.println("Cannot book ticket for ".concat(movieName).concat(" ticket is full for ").concat(ticketType.toString()));
				throw new HouseFullRunTimeException( "ticket is maxm 5 for balcony");
			}
		}
		return false;
	}


}







