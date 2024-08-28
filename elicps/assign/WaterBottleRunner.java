package com.xworkz.inheritance.assign;

import com.xworkz.inheritance.assingment.Devu;
import com.xworkz.inheritance.assingment.Gunashree;
import com.xworkz.inheritance.assingment.Shwetha;
import com.xworkz.inheritance.assingment.WaterBottle;

public class WaterBottleRunner {
 
	
	public static void main(String[] args) {
		
		Gunashree gunashree=new Gunashree();
		gunashree.drink();
		
		Shwetha shwetha=new Shwetha();
		WaterBottle waterBottle1=new WaterBottle();
		shwetha.wash(waterBottle1);
		
		Devu devu=new Devu();
		WaterBottle waterBottle2=new WaterBottle();
		devu.waterBottle=(waterBottle2);

	}
	
}









	