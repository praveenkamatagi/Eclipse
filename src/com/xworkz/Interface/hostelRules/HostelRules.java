package com.xworkz.Interface.hostelRules;

import com.xworkz.Interface.HospitalRules;

public class    HostelRules implements HospitalRules {
	public  String gender() {
		return null;
	}
	public double closeTime() {
		return 10;
	}
	public boolean Admission() {
		return false;
	}

	@Override
	public String register() {
		System.out.println("invoked register");
		return "registration";
	}

	@Override
	public double payAdvance() {
		System.out.println("invoked payAdvance");
		return 25000.0;
	}

	@Override
	public boolean vaildInsurance() {
		System.out.println("invoked vaildInsurance");
		return true;
	}

}
