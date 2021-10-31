package com.xworkz.charger.DAO;
import com.xworkz.charger.dto.*;
import com.xworkz.charger.dto.chargerDTO;

public class ChargerDAOStarter {
	public static void main(String[] args) {
		 
		chargerDAO dao=new chargerDAO();
		chargerDTO chargerDTO=new chargerDTO("narzo",1900.25f,"blue", "reverse",5);
		chargerDTO chargerDTO1=new chargerDTO("k8",6999.25f,"white","normal",8);
		 
		
		dao.add(chargerDTO1);
		dao.add(chargerDTO);
		

		dao.delete(2);

	}

}


