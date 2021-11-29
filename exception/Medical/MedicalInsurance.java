package com.xworkz.exception.Medical;

import com.xworkz.exception.CashlessException.CashlessException;

public class MedicalInsurance {
	MedicalInsurance(){
		System.out.println("non arg const");
	}
  void canAvailCashless(String name ,double totalHourInHospital) throws CashlessException{
		if(name!=null && name.length()>2 && name.length()<=26 && totalHourInHospital<24) {
			System.out.println("eligible for insurance");
		}
		else {
			System.out.println("not eligible for insurance");
			throw new CashlessException();
		}
		
		
	}

}
