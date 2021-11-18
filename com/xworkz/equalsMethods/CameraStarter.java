package com.xworkz.equalsMethods;

 

public class CameraStarter {
	public static void main(String[] args) {
		Camera camera =new Camera();
		camera.setCompany("DSLR");
		camera.setPrice(500000);
		camera.setModel(121);
		camera.setPixel(48);
		camera.toString();
		camera .hashCode();
		
		
		Camera camera1 =new Camera();
		camera1.setCompany("DSLR");
		camera1.setPrice(500000);
		camera1.setModel(121);
		camera1.setPixel(48);
		camera1.toString();
		camera1 .hashCode();
		
		 
		
		 System.out.println(camera.getCompany());
		 System.out.println(camera.getPrice());
		 System.out.println(camera.getModel());
		 System.out.println(camera.getPixel());
	System.out.println();
	Class cls=camera.getClass();
	System.out.println(cls.getMethods().length);
	System.out.println (cls.getConstructors().length);
	System.out.println (cls.getFields().length);
	System.out.println (cls.getConstructors().length);
	boolean same = camera.equals(camera1);
	System.out.println(same);
	
	}}