package com.xworkz.woodshop.design;
import com.xworkz.woodshop.design.*;
import com.xworkz.woodshop.design.Furniture;
import com.xworkz.woodshop.design.DineTable;
public class FurnituresCrackers {
public static void main(String[] args) {
		
		
		ComputerTable computertable=new ComputerTable();
        System.out.println(computertable.durablity);
        Furniture furniture =new Furniture("long life span", 20);
        System.out.println(furniture.quantity);
        DineTable dineTable=new DineTable();
        System.out.println(dineTable.durablity);
       
        
       
	}

}

