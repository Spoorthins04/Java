package com.xworkz.inheritance.assingment;

public class Omkar {
	
		public void tie(Shoe shoe)
		{
			if(shoe!=null)
			{
			shoe.enhanceWalk();
			shoe.safeGuard();
		    System.out.println(shoe.brand);
		    System.out.println(shoe.cost);
			}
			else {
				System.out.println("shoe is null");
			}




		}

	}

