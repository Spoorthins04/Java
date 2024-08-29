package com.xworkz.inheritance.assign;

import com.xworkz.inheritance.assingment.Divya;
import com.xworkz.inheritance.assingment.Harshitha;
import com.xworkz.inheritance.assingment.Omkar;
import com.xworkz.inheritance.assingment.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		Divya divya=new Divya();
		divya.wear();
		
		Omkar omkar=new Omkar();
		Shoe shoe1=new Shoe();
		omkar.tie(shoe1);
		
		Harshitha harsitha=new Harshitha();
		Shoe shoe2=new Shoe();
		harsitha.shoe=(shoe2);

  }

}


