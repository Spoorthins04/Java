class Train {
    public static void book(String source, String destination) {
        System.out.println("Booking a ticket from " + source + " to " + destination);
        System.out.println("running source and destination");
        System.out.println("source :" + source);
        System.out.println("destination :" + destination);
    }

    public static void book(String source, String destination, int quantity) {
        System.out.println("Booking " + quantity + " tickets from " + source + " to " + destination);
        System.out.println("running source ,destination and quantity");
        System.out.println("source :" + source);
        System.out.println("destination :" + destination);
        System.out.println("quantity :" + quantity);
    }

    public static void book(String source, String destination, int quantity, double price) {
        System.out.println("Booking " + quantity + " tickets from " + source + " to " + destination + " at a price of " + price);
        System.out.println("running source ,destination ,quantity and price");
        System.out.println("source :" + source);
        System.out.println("destination :" + destination);
        System.out.println("quantity :" + quantity);
        System.out.println("price :" + price);
    }

    public static void cancel(long ticketNo) {
        System.out.println("Canceling ticket number " + ticketNo);
        System.out.println("running ticketNo in cancel method");
        System.out.println("ticketNo :" + ticketNo);
    }

    public static void cancel(String source, String destination) {
        System.out.println("Canceling ticket from " + source + " to " + destination);
        System.out.println("running source and destination");
        System.out.println("source :" + source);
        System.out.println("destination :" + destination);
    }
}

class ChukubukuTrain {
    public static void main(String[] args) {
        Train.book("SBC", "Miraj");
        Train.book("Belagavi", "UgarKhurd", 4440);
        Train.book("Vijayapur", "Yeshwantpura", 4540, 1290.9980);
        Train.cancel(1234567890);
        Train.cancel("Ahmadnagar", "Hyderabad");
    }
}

//This updated code includes additional print statements to show which method is being called and with what parameters. This can help you understand the flow of the program and ensure that the correct methods are being called.