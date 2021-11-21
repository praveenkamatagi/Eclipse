package com.xworkz.abstracts.BankStarter;

import com.xworkz.abstracts.Bank.Bank;
import com.xworkz.abstracts.HdfcBank.HdfcBank;
import com.xworkz.abstracts.HdfcBank.IciciBank;

public class BankStarter {
	public static void main(String[] args) {
		Bank bank=new IciciBank();
		bank.provideLoan();
		bank.openAccount();
		String name=bank.getName();
		System.out.println(name);
		String ifsc=bank.getIfscCode();	
		System.out.println(ifsc);

		Bank bank1=new HdfcBank("Hdfc","bank bankOpened");
		bank1.provideLoan();
		bank1.openAccount();
		String  Name=bank.getName();
		System.out.println(Name);
		String ref=bank.getIfscCode();	
		System.out.println(ref);

	}
	}

