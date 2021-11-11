package com.xworkz.EmailDTO;

public class GmailEmailDTO  extends EmailDTO {
	public String themeColor;
	private int subscribed;
	public GmailEmailDTO() {
		System.out.println("invoked no arg const GmailemailDto");
	}
	public GmailEmailDTO(int storageSize,String free,double noOFEMailPerDay,String emaiID,String themeColor,int subscribed) {
		this.themeColor=themeColor;
		this.subscribed=subscribed;
		
	}
	public String getThemeColor() {
		return themeColor;
	}
	public void setThemeColor(String themeColor) {
		this.themeColor = themeColor;
	}
	public int getSubscribed() {
		return subscribed;
	}
	public void setSubscribed(int subscribed) {
		this.subscribed = subscribed;
	}
	}


