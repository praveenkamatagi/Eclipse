package com.xworkz.EmailDTO;
import com.xworkz.EmailDAO.*;
import com.xworkz.EmailDTO.EmailDTO;
import com.xworkz.EmailDTO.GmailEmailDTO;
import com.xworkz.EmailDTO.OutlookEmailDTO;
public class EmailStarter {
	public static void main(String[] args) {
		EmailDAO emailDAO=new EmailDAO();
		EmailDTO emailDTO=new EmailDTO(800,"yes",80,"praveen@gmail.com");
		emailDAO.save(emailDTO);
		OutlookEmailDTO outLookEmailDTO=new OutlookEmailDTO(128,"nobackup"); 
		emailDAO.save(outLookEmailDTO);
		GmailEmailDTO gmailEmailDTO=new GmailEmailDTO(64, "yesBackup",150.00d,"pravin@gmail.com","blue",20);
		emailDAO.save(gmailEmailDTO);
		emailDAO.displayDetailsEmailDTO();
		emailDAO.displayDetailsOutLookEmailDTO();
		emailDAO.displayDetailsGmailEmailDTO();
	}

}


