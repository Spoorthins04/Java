public class Train12
{
    public static void book(String source, String destination) {
        book(source, destination, 0, 0.0);
    }

    public static void book(String source, String destination, int quantity) {
        book(source, destination, quantity, 0.0);
    }

    public static void book(String source, String destination, int quantity, double price) {
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public static void cancel(long ticketNo) {
        System.out.println("Ticket No: " + ticketNo);
    }

    public static void cancel(String source, String destination) {
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
    }

    public static void main(String[] args) {
        book("SBC", "Miraj");
        book("Belagavi", "UgarKhurd", 4440);
        book("Vijayapur", "Yeshwantpura", 4540, 1290.9980);
        cancel(1234567890);
        cancel("Ahmadnagar", "Hyderabad");
    }
}