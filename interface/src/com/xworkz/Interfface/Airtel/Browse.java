package com.xworkz.Interfface.Airtel;

import com.xworkz.interfaces.Internet;

public class Browse {
	
	
	private Internet net;


	public Browse(Internet net)
	{
		System.out.println("invoking internet from the browser");
		this.net=net;
	}

	public void browse()
	{
	 
if(this.net!=null)
		{
			boolean connect=net.connect();
			int speed=net.speed();

			if(connect==true && speed>1)
			{
				System.out.println("connected to internet");
			}
			else 
			{
				System.out.println("not connected to Internet"); 
			}

		}
		
		 
	}

	public void errorInConnecting()
	{
		System.out.println("error  connecting ");
	}
	public void changeInInterNet() {
		System.out.println("Change InterNet");
		
	}
	public void disConnect() {
		System.out.println("changing internet");
	}

}

