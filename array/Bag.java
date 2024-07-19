class Bag{
	
	public static void store(){
		System.out.println("Stores the things");
		full();
	}
	
	public static void empty(){
		System.out.println("Bag is empty");
		half_empyty_half_full();
	}
	
	public static void full(){
		System.out.println("Bag is full");
		half_empyty_half_full();
	}
	
	public static void half_empyty_half_full(){
		System.out.println("Bag is half empty half full");
	}
	
}