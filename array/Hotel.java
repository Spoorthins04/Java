class Hotel{
	
	String name="Vinayaka";
	Owner owner=new Owner("Shwetha",23,'f');
	
	public Hotel(){
		
	}
	
	public void display(){
		
		System.out.println("hotel name:"+name);
		owner.show();
	}
}