public class SnakeRunner{
// ctrl+shift+f
public static void main (String[] args){
	Snake snake=new Snake("guna",10,"cobra");
	Snake snake1=new Snake("veera",7,"python");
	Snake snake2=new Snake("siri",8,"green snake");
	
	Snake[] ref=new Snake[3];
	
	ref[0]=snake;
	ref[1]=snake1;
	ref[2]=snake2;
	 
	for(Snake snakeTemp:ref)
	{
		System.out.println(snakeTemp);
		snakeTemp.mudrisu();
	}
  }
}