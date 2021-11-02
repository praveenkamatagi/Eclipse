package com.xworkz.FoodDTO;
import com.xworkz.FoodDTO.*;
import com.xworkz.FoodDTO.FoodDAO;
 
public class FoodStarterDAO {
	public static void main(String[] args) {
		
		FoodDAO foodDAO=new FoodDAO();
		FoodDTO foodDTO=new FoodDTO(1,"vegPa;lava",FoodType.Joladarotti,560.00,3);
	    foodDAO.add(foodDTO);
	    FoodDTO foodDTO1=new FoodDTO(2,"PuriBhaji",FoodType.idle,60.00,8);
	    foodDAO.add(foodDTO1);
	    FoodDTO foodDTO2=new FoodDTO(2,"Bhaji",FoodType.masaladosa ,80.00,7);
	    foodDAO.add(foodDTO2);
	    FoodDTO foodDTO3=new FoodDTO(2,"whiteRice",FoodType.curdRice,40.00,6);
	    foodDAO.add(foodDTO3);
	    FoodDTO foodDTO4=new FoodDTO(2,"ChickenMasala",FoodType.chickenncurry,70.00,2);
	    foodDAO.add(foodDTO4);
	    foodDAO.updatePriceByName("BIRYANI",60.00);
	    foodDAO.updateQuantityByName("CHILLY CHICKEN",7);
	    foodDAO.findByName("NOODLES");
	    foodDAO.findByName("LEMON CHICKEN");
	    foodDAO.findByNameAndPrice("ICE-CREAM",40.00);
	    foodDAO.findByNameAndType("FISH",FoodType.Joladarotti);
	    foodDAO.findByNameAndType("LEMON CHICKEN",FoodType.idle);
	    foodDAO.displayDetails();
	    foodDAO.printTotalFoodItems();
		}

	
}
