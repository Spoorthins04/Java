class Company{
	
	int id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("Sudeep",7,"software developer",90000);
	
	
	public Company(int id,String name,String location){
		
		
		this.id=id;
		this.name=name;
		this.location=location;
	}
	
	
	public void details(){
		
		System.out.println("company id:"+id);
		System.out.println("company name:"+name);
		System.out.println("company location:"+location);
		softwareEngineer.details();
		
	}




}