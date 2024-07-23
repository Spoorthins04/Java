class Operation{
	
	public static void main(String[] args){
		System.out.println("This is to invoke the metoh from another class");
		Bag.store();
		Bag.empty();
		//Bag.half_empyty_half_full();
		zip();
		keychain();
		closed();
		opened();
		lenght();
		size();
		backpack();
		heavy();
		clean();
		color();
	}
	
	public static void zip(){
		System.out.println("Bag is closed");
	}
	public static void keychain(){
		System.out.println("Bag is opened");
	}
	public static void closed(){
		System.out.println("Bag is semi-closed");
	}
	public static void opened(){
		System.out.println("Bag is semi-open");
	}
	public static void lenght(){
		System.out.println("Bag is heavy");
	}
	public static void size(){
		System.out.println("Bag is wet");
	}
	public static void backpack(){
		System.out.println("Bag is small");
	}
	public static void heavy(){
		System.out.println("Bag is big");
	}
	public static void clean(){
		System.out.println("Bag is dusty");
	}
	public static void color(){
		System.out.println("Bag is red ");
	}
}