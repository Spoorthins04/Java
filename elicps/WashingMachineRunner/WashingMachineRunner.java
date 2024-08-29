package com.xworkz.WashingMachineRunner;

import com.xworkz.WashingMachine.Abhishek;
import com.xworkz.WashingMachine.Bhumika;
import com.xworkz.WashingMachine.Lakshmi;
import com.xworkz.WashingMachine.Megha;
import com.xworkz.WashingMachine.WashingMachine;
import com.xworkz.WashingMachine.nayana;

public class WashingMachineRunner {

	public static void main(String[] args) {

		Megha megha = new Megha();
		megha.WashingMachine();

		Lakshmi lakshmi = new Lakshmi();
		lakshmi.machine(null);

		WashingMachine washingmachine1 = new WashingMachine("LG", "Topload", 9);
		Abhishek abhishek = new Abhishek(washingmachine1);
		abhishek.rinse();

		Bhumika bhumika = new Bhumika();
		WashingMachine ref = bhumika.spin();
		if (ref != null) {
			ref.rinse();
			ref.show();

			nayana nayana = new nayana();
			nayana.WashingMachine();
		}

	}

}
