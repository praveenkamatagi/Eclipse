package com.xworkz.Interface.hostelRules;

import com.xworkz.Interface.HospitalRules;

public class HostelHospitalStarter {
	public static void main(String[] args) {
		HospitalRules hospital=new HostelRules();
		String ref= hospital.register();
		double ref1=hospital.payAdvance();
		boolean ref2=hospital.vaildInsurance();
		// boolean ref3=hospital.Admission();
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println(ref2);
		HostelRules hostel=new HostelRules();
		hostel.gender();
		hostel.closeTime();
		hostel.Admission();
	}

}
