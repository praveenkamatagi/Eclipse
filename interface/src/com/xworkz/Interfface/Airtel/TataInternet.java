package com.xworkz.Interfface.Airtel;

import com.xworkz.interfaces.Internet;

public class TataInternet implements Internet {

	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		System.out.println("invoked conncect tatanet from internet");
		return false;
	}

	@Override
	public int speed() {
		// TODO Auto-generated method stub
		System.out.println("invoked tatanet from internret ");
		return 2;
	}

	@Override
	public void disConnect() {
		// TODO Auto-generated method stub
		System.out.println("invoked disconnect from tata interner");
		
	}

}
