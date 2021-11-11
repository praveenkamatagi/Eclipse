package com.xworkz.EmailDAO;
import com.xworkz.EmailDAO.EmailDAO;
import com.xworkz.EmailDTO.EmailDTO;
import com.xworkz.EmailDTO.GmailEmailDTO;
import com.xworkz.EmailDTO.OutlookEmailDTO;
public class EmailDAO {
	EmailDTO[] emaildto=new EmailDTO[6];
	OutlookEmailDTO outlook=new OutlookEmailDTO();
	GmailEmailDTO gmaildto=new GmailEmailDTO();
	 
	
	
	private int count;
	 
	public EmailDAO()
	{
		System.out.println("invoked emaiId");
	}
	public void save(EmailDTO emailDTO)
	{
		if(emailDTO!=null && this.count<this.emaildto.length)
		{
			this.emaildto[count]=emailDTO;
			System.out.println("emaildto is saved");
			this.count++;
		}
		else
		{
			System.err.println("emaildto is not saved or full");
		}
	}
	public void save(OutlookEmailDTO outLookEmailDTO)
	{
		if(outLookEmailDTO!=null && this.count<this.emaildto.length)
		{
			this.emaildto[count]=outLookEmailDTO;
		    System.out.println("outlookemaildto is saved");
		    this.count++;
		}
		else
	  {
		System.err.println("outlook emaildto is not saved");
	  }
	}

	public void save(GmailEmailDTO gmailEmailDTO)
	{
		if(gmailEmailDTO!=null && this.count<this.emaildto.length)
		{
			this.emaildto[count]=gmailEmailDTO;
		    System.out.println("gmaildto is saved");
		    this.count++;
		}
		else
	  {
		System.err.println("gmailemaildto is not saved or full");
	  }
	}
	public void displayDetailsEmailDTO() {
		
		for(int i=0;i<this.emaildto.length;i++)
		{
			EmailDTO test=this.emaildto[i];
			if(test!=null)
			{
			 
				System.out.println(String.valueOf(test.getStorageSize()).concat(" ").concat(String.valueOf(test.getFree())).concat(" ").concat(String.valueOf(test.getNoOFEMailPerDay())).concat(" ").concat(test.getEmaiID()));
			}
			
		}
	}
	public void displayDetailsOutLookEmailDTO() {
		// TODO Auto-generated method stub
		for(int i=0;i<this.emaildto.length;i++)
		{
			EmailDTO test=this.emaildto[i];
			if(test!=null)
			{
			 
				System.out.println(String.valueOf(test.getStorageSize()).concat(" ").concat(String.valueOf(test.getFree())).concat(" ").concat(String.valueOf(test.getNoOFEMailPerDay())).concat(" ").concat(test.getEmaiID()));
			}
			
		}
	}
	
public void displayDetailsGmailEmailDTO() {
	
	for(int i=0;i<this.emaildto.length;i++)
	{

		GmailEmailDTO ref2 = null;
		System.out.println(ref2.getThemeColor());
		System.out.println(ref2.getSubscribed());
		GmailEmailDTO value1=(GmailEmailDTO)this.emaildto[i];
		if(value1!=null)
		{
		 

			System.out.println(String.valueOf(ref2.getStorageSize()).concat(" ").concat(String.valueOf(ref2.getFree())).concat(" ").concat(String.valueOf(ref2.getNoOFEMailPerDay())).concat(" ").concat(ref2.getEmaiID()));
		}
		
		
	}
}
}
 
	

