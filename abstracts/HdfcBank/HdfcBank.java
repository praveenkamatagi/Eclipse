package com.xworkz.abstracts.HdfcBank;

import com.xworkz.abstracts.Bank.Bank;

public class HdfcBank  extends Bank{
	public HdfcBank(String name,String ifscCode) {
		super("HDFC", "Bank");
		
	}

	@Override
	public void provideLoan() {
	System.out.println("  invoked loan")	;
		
	}

	@Override
	public void openAccount() {
		System.out.println(" invoked ope account");
		
	}

}


