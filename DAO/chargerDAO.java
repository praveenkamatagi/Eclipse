package com.xworkz.charger.DAO;
import com.xworkz.charger.dto.chargerDTO;
public class chargerDAO {
	private chargerDTO[] Container=new chargerDTO[5];
    private int charging;

    public chargerDAO()
    {
   	 System.out.println("invoked ChargerDAO");
    }

    public void add(chargerDTO charger)
    {
   	 if(this.charging<this. Container.length && charger!=null)
   	 {
   		 this. Container[charging]=charger;
   		charging++;
   		 System.out.println("added at index: ".concat(String.valueOf(charging)).concat(" ").concat(" ").concat(String.valueOf(charger.getBrand())).concat(" ").concat("  ").concat(String.valueOf(charger.getQuantity())));
   	 }
   	 else
   	 {
   		 System.out.println("container is full ");
   	 }
    }

    public void delete(int index)
    {
   	this. Container[index]=null; 
   	System.out.println("deleted container index: ".concat(String.valueOf(index)));


    }



}


