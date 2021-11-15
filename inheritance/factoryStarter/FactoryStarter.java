package com.xworkz.inheritance.factoryStarter;

import com.xworkz.inheritance.carfactory.carfactory;
import com.xworkz.inheritance.factory.Factory;

public class FactoryStarter {
public static void main(String[] args) {
	Factory factory=new Factory();
	System.out.println(factory.toString());
	System.out.println(factory.hashCode());
	 factory.manufacture();
	 
	 carfactory car=new carfactory();
	 car.shutdown();
	 
	 Factory factory1=new carfactory();
System.out.println(factory1.toString());
System.out.println(factory1.hashCode());
}
}
