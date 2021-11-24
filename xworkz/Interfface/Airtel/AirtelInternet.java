package com.xworkz.Interfface.Airtel;

import com.xworkz.interfaces.Internet;

public class AirtelInternet implements Internet {

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		System.out.println("invoked connect from internet");
		return false;
	}

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		System.out.println("invoked speed from internet");
		return 1;
	}

	@Override
	public void disConnect() {
		// TODO Auto-generated method stub
		System.out.println("invoked disconnect from internet");
		
	}

}
