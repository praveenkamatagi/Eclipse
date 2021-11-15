package com.xworkz.inheitance.inheritance;

import com.xworkz.inheitance.ladder.Batladder;
import com.xworkz.inheitance.ladder.ladder;

public class ladderStarter {
	public static void main(String[] args) {
		ladder lad=new ladder();
		System.out.println("*******");
		System.out.println(lad.toString());
		System.out.println(lad.hashcode());
		lad.lift();
		
		ladder batladder=new Batladder();
		System.out.println(batladder.toString());
		System.out.println(batladder.hashcode());
	}

}
