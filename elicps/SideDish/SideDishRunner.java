package com.xworkz.SideDish;

public class SideDishRunner {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SideDishStore store=new SideDishStore();
			// store.display();
			
			SideDishData data1=new SideDishData("aloo 65",100,"veg");
			SideDishData data2=new SideDishData("papad",60,"sides");
			SideDishData data3=new SideDishData("greek salad",250,"salad");
			SideDishData data4=new SideDishData("panner tikka",350,"veg");
			SideDishData data5=new SideDishData("grilled corn",150,"veg");
			
			
			store.save(data1);
			store.save(data2);
			store.save(data3);
			store.save(data4);
			store.save(data5);
			
			
			store.display();
		}
	}
