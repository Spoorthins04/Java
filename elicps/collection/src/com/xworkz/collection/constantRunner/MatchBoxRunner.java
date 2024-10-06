package com.xworkz.collection.constantRunner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.constant.MatchBoxMaterial;
import com.xworkz.collection.constantDTO.MatchBoxDTO;

public class MatchBoxRunner {

	public static void main(String[] args) {
		MatchBoxDTO matchboxdto = new MatchBoxDTO(4,"WOOD",MatchBoxMaterial.WOOD);
		MatchBoxDTO matchboxdto1 = new MatchBoxDTO(5,"WOOD",MatchBoxMaterial.METAL);
		
		Collection<MatchBoxDTO> collection =new LinkedList <MatchBoxDTO>();
		collection.add(matchboxdto1);
		collection.add(matchboxdto);
		System.out.println("total element :"+collection.size());
		System.out.println("isEmpty:"+collection.isEmpty());
		collection.clear();
		System.out.println("after clear...");
		System.out.println("isEmpty:"+collection.isEmpty());
		System.out.println("total element :"+collection.size());
		
		Iterator<MatchBoxDTO> iterator =collection.iterator();
		
		while(iterator.hasNext()) {
			System.out.println("element exist");
			MatchBoxDTO ref = iterator.next();
			
			System.out.println(ref);
			
			
		}

	}
}

