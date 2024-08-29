package com.xworkz.inheritance.assign;

import com.xworkz.inheritance.assingment.DeadSea;
import com.xworkz.inheritance.assingment.Erosion;
import com.xworkz.inheritance.assingment.Plain;
import com.xworkz.inheritance.assingment.Valleys;

public class ValleyRunner {
	


		public static void main(String[] args) {
			Plain plain=new Plain();
			plain.earth();

			Erosion erosion=new Erosion();
			Valleys valleys1=new Valleys(20);
			erosion.soil(valleys1);


			DeadSea deadsea=new DeadSea();
			Valleys valleys2=new Valleys();
			deadsea. valleys=(valleys2);


		}

	}

