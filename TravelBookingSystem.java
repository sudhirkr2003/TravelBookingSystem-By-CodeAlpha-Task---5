import java.util.Scanner;

class Flight {
    String flightNumber;
    String departure;
    String destination;
    String date;
    int seatsAvailable;
    String Price;

    public Flight(String flightNumber, String departure, String destination, String date, int seatsAvailable, String Price) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.seatsAvailable = seatsAvailable;
        this.Price = Price;
    }

    public void displayFlightDetails() {
        System.out.println("\nFlight Details:");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("From: " + departure + " To " + destination);
        System.out.println("Date: " + date);
        System.out.println("Seats Available: " + seatsAvailable);
        System.out.println("Price: " + Price);
    }
}

class Hotel {
    String name;
    String location;
    int roomsAvailable;
    String Price;

    public Hotel(String name, String location, int roomsAvailable, String Price) {
        this.name = name;
        this.location = location;
        this.roomsAvailable = roomsAvailable;
        this.Price = Price;
    }

    public void displayHotelDetails() {
        System.out.println("\nHotel Details:");
        System.out.println("Hotel Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Rooms Available: " + roomsAvailable);
        System.out.println("Price: " + Price);
    }
}

class Transportation {
    String type;
    String departure;
    String destination;
    String date;
    String Price;

    public Transportation(String type, String departure, String destination, String date, String Price) {
        this.type = type;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.Price = Price;
    }

    public void displayTransportationDetails() {
        System.out.println("\nTransportation Details:");
        System.out.println("Transportation Type: " + type);
        System.out.println("From: " + departure + " To: " + destination);
        System.out.println("Date: " + date);
        System.out.println("Price: " + Price);
    }
}


    

public class TravelBookingSystem {

    public static void main(String[] args) {

        Library[] lib = new Library[100];
    String name,age,gander;
    int input, count = 0;

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < lib.length; i++) {
        lib[i] = new Library();
    }
        

        Flight flight1 = new Flight("6E 7316", "Indore", "Jabalpur", "2024-02-25", 150,"7925.0 + GST Amount");
        Hotel hotel1 = new Hotel("Apna Hotel", "Jabalpur", 100,"5000.0 + Maintenance Charge");
        Transportation transportation1 = new Transportation("Train", "Jabalpur", "Bhopal", "2024-02-25", "980.25 + GST Amount");

        while (true) {
            System.out.println("\n****** Welcome to Travel Booking System ******");
            System.out.println("1. Book Flight");
            System.out.println("2. Book Hotel");
            System.out.println("3. Book Transportation");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    flight1.displayFlightDetails();
                    bookFlight(scanner);
                    break;
                case 2:
                    hotel1.displayHotelDetails();
                    bookHotel(scanner);
                    break;
                case 3:
                    transportation1.displayTransportationDetails();
                    bookTransportation(scanner);
                    break;
                case 4:
                    System.out.println("Thank You For Using Our Service. Have a Great Trip!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    break;
            }
        }
    }

    public static void bookFlight(Scanner scanner) {
        System.out.println("\n*** Booking Flight ***");
        System.out.print("\nEnter Your Name: ");
        scanner.next();
        String name = scanner.nextLine();   
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Your Gender: ");
        String gender = scanner.next();
        System.out.print("Enter Mobile No.: ");
        long mobile = scanner.nextLong();

        System.out.println("\nThank you, " + name + "! Your Flight Ticket Is Booked Successfully.");
        System.out.println("Your Booking Details:");
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Mobile No.: " + mobile);
        System.out.println("Total Money For The Ticket is Rs.- 8063.85");
    }

    public static void bookHotel(Scanner scanner) {
        System.out.println("\n*** Booking Hotel Room ***");
        System.out.print("\nEnter Your Name: ");
        scanner.next();
        String name = scanner.next();
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Your Gender: ");
        String gender = scanner.next();
        System.out.print("Enter Mobile No.: ");
        long mobile = scanner.nextLong();

        System.out.println("\nThank you, " + name + "! Your Room Is Booked Successfully.");
        System.out.println("Your Booking Details:");
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Mobile No.: " + mobile);
        System.out.println("Total Money For The Room is Rs. 7000");
    }

    public static void bookTransportation(Scanner scanner) {
        System.out.println("\n*** Booking Transportation ***");
        System.out.print("\nEnter Your Name: ");
        scanner.next();
        String name = scanner.next();
        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Your Gender: ");
        String gender = scanner.next();
        System.out.print("Enter Mobile No.: ");
        long mobile = scanner.nextLong();

        System.out.println("\nThank you, " + name + "! Your Train Ticket Is Confirmed Successfully.");
        System.out.println("Your Booking Details:");
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Mobile No.: " + mobile);
        System.out.println("Total Money For One Ticket is Rs. 1085.68");
    }
}
