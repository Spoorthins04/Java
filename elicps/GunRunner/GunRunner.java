package com.xworkz.GunRunner;

import com.xworkz.Gun.Dboss;
import com.xworkz.Gun.Godse;
import com.xworkz.Gun.Gun;
import com.xworkz.Gun.Police;
import com.xworkz.Gun.Solider;

public class GunRunner {

	public static void main(String[] args) {

		Solider solider = new Solider();
		solider.gun();

		Police police = new Police();
		Gun gun = new Gun("Sniper", "America", "Longrange");
		police.shoot(gun);

		Gun gun1 = new Gun("SingleBarral", "Germany", "Shortgun");
		Dboss dboss = new Dboss(gun1);
		dboss.fire();

		Godse godse = new Godse();
		Gun ref = godse.out();
		if (ref != null) {
			ref.fire();
			ref.display();
		}

	}

}
