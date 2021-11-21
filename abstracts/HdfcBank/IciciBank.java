package com.xworkz.abstracts.HdfcBank;

import com.xworkz.abstracts.Bank.Bank;

public class IciciBank extends Bank {
	public IciciBank() {
		super("Icici","bank");
		
	}

	@Override
	public void provideLoan() {
	System.out.println("  invoked loan")	;
		
	}

	@Override
	public void openAccount() {
		System.out.println("  invoked open account");
		
	}

}
	



