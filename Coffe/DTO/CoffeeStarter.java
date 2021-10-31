package com.xworkz.Coffe.DTO;
import com.xworkz.Coffe.DTO.CoffeeDTO ;

public class CoffeeStarter {
	public static void main(String[] args) 
	{

		CoffeeDTO  coffeeDTO=new CoffeeDTO();
     coffeeDTO.setBrand("BRU");
     coffeeDTO.setFlavour("VANILA");
     coffeeDTO.setQuantity(10);
     coffeeDTO.setCaffinePercentage(20);
     coffeeDTO.setType("filter");

     String brand=coffeeDTO.getBrand();
     String flavour=coffeeDTO.getFlavour();

     System.out.println(brand.concat(" ").concat(flavour).concat(" ").concat(String.valueOf(coffeeDTO.getQuantity())
    		 .concat(" ").concat(String.valueOf(coffeeDTO.getCaffinePercentage())).concat(" ").concat(coffeeDTO.getType())));

     CoffeeDTO  coffeeDTO2=new CoffeeDTO ("NESCAFE", 10,"BUTTERSCOTCH","filter",180);

    System.out.println(coffeeDTO2.getBrand().concat(" ").concat(coffeeDTO2.getFlavour()).concat(" ").concat(String.valueOf(coffeeDTO2.getQuantity())
    .concat(" ").concat(String.valueOf(coffeeDTO2.getCaffinePercentage())).concat(" ").concat(coffeeDTO2.getType())));

}
}