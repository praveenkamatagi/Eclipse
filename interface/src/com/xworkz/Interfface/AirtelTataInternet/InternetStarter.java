package com.xworkz.Interfface.AirtelTataInternet;

import com.xworkz.Interfface.Airtel.AirtelInternet;
import com.xworkz.Interfface.Airtel.Browse;
import com.xworkz.Interfface.Airtel.TataInternet;
import com.xworkz.interfaces.Internet;

public class InternetStarter {
	public static void main(String[] args) {
		
	
	Internet internet=new AirtelInternet();
	Internet internet1=new TataInternet();
	Browse browse=new Browse(internet);
	 
	 browse.browse();
	browse.changeInInterNet(); 
browse.disConnect();
browse.errorInConnecting();
 
	}
	 
	 
 

}
