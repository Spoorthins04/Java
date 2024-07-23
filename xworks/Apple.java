class Apple{

	public static void main1(){
		System.out.println("This is static method with access specifier");
	}
	
	static void main2(){
		System.out.println("Static method without Access Specifier");
	}
	
	void main3(){
		System.out.println("Method without access specifier and static method");
	}
	
	//abstract void main4();
	
	public void main5(){
		System.out.println("Method with access specifier and without the non access(static) specifier");
	}
	
	public static void main(String[] args){
		System.out.println("This is Static method with access specifier in addition to arguments");
		main1();
		main2();
		Methods m = new Methods();
		
		m.main3();
		//m.main4();
		m.main5();
	}
}

