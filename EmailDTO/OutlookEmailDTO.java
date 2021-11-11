package com.xworkz.EmailDTO;

public class OutlookEmailDTO extends EmailDTO {
	
		// TODO Auto-generated constructor stub
	
	public int Storage;
	private String backup;
	public OutlookEmailDTO () {
		 
		System.out.println("invoked outlookConstructor");
	}
	
	public OutlookEmailDTO(int storage, String backup) {
		 super();
		this.Storage=storage;
		this.backup=backup;
	 
		
		
	}
	public int getStorage() {
		return Storage;
	}
	public void setStorage(int storage) {
		Storage = storage;
	}
	public String getBackup() {
		return backup;
	}
	public void setBackup(String backup) {
		this.backup = backup;
	}

}
