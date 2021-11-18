package com.xworkz.equalMethod;

public class BridgeStarter {
	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		bridge.setName("front gate");
		bridge.setLength(285.f);
		bridge.setCost(250000);
		bridge.setOpenYear(2021);
		bridge.toString();
		bridge.hashCode();

		Bridge bridge1 = new Bridge();
		bridge1.setName("golden gate");
		bridge1.setLength(789.f);
		bridge1.setCost(466590);
		bridge1.setOpenYear(1987);

		Bridge bridge2 = new Bridge();
		Class cls = bridge2.getClass();
		System.out.println(cls.getMethods().length);
		System.out.println(cls.getFields().length);
		System.out.println(cls.getConstructors().length);
		boolean same = bridge.equals(bridge1);
		System.out.println(same);
	}

}


