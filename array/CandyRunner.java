class CandyRunner
{
  public static void main(String[] args)
  {
	  System.out.print("Start main in CandyRunner");
	  
	  Candy candy=new Candy();
	  float cost=candy.cost;
	  String flavor=candy.flavor;
	  String colour=candy.colour;
	  System.out.println("Candy cost:"+ cost);
	  System.out.println("Candy flavor:"+flavor);
	  System.out.println("Candy colour:"+colour);
	  
	  candy.cost=5;
	  candy.flavor="cherry";
	  candy.colour="red";
	  System.out.println("Candy cost updated:"+candy.cost);
	  System.out.println("Candy flavor updated:"+candy.flavor);
	  System.out.println("Candy colour updated:"+candy.colour);
	  
	   System.out.print("end main in CandyRunner");
  }
 }