 public class Paint1 
 {
    public static void buy(String brandname) 
	{
        System.out.println("The brand name is:");
        System.out.println("Brand name: " + brandname);
    }

    public static void wall(String brand, String color) 
	{
        System.out.println("The wall details are:");
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }

    public static void buy(String brand, int price) 
	{
        System.out.println("The paint brand and price are:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void buy(String color, String type, int price) 
	{
        System.out.println("The paint details are:");
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args)
	{
        Paint1.buy("Nerolac");
        Paint1.wall("Excel Total", "White");
        Paint1.buy("Asian Paint", 2000);
        Paint1.buy("Red", "Interlock", 150);
    }
}