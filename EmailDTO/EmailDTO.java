package com.xworkz.EmailDTO;

public class EmailDTO {
	public int storageSize;
	private String free;
	protected double noOFEMailPerDay;
	public String emaiID;
	public EmailDTO(int storageSize, String free, double noOFEMailPerDay, String emaiID) {
		super();
		this.storageSize = storageSize;
		this.free = free;
		this.noOFEMailPerDay = noOFEMailPerDay;
		this.emaiID = emaiID;
	}
	public EmailDTO() {
		
		// TODO Auto-generated constructor stub
	}
	public int getStorageSize() {
		return storageSize;
	}
	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	public String getFree() {
		return free;
	}
	public void setFree(String free) {
		this.free = free;
	}
	public double getNoOFEMailPerDay() {
		return noOFEMailPerDay;
	}
	public void setNoOFEMailPerDay(double noOFEMailPerDay) {
		this.noOFEMailPerDay = noOFEMailPerDay;
	}
	public String getEmaiID() {
		return emaiID;
	}
	public void setEmaiID(String emaiID) {
		this.emaiID = emaiID;
	}
	 
}