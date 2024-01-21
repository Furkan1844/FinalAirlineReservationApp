import Entities.Location;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Location istanbul = new Location();
        istanbul.setLocation(1, "Turkiye", "Istanbul", "Ataturk Airport");
        Location newYork = new Location();
        newYork.setLocation(2, "USA", "New York", "New York Airport");
        Location tokyo = new Location();
        tokyo.setLocation(3, "Japan", "Tokyo", "Tokyo Airport");
        Location beirut = new Location();
        beirut.setLocation(4, "Lebanon", "Beirut", "Beirut Airport");
        Location madrid = new Location();
        madrid.setLocation(5, "Spain", "Madrid", "Madrid Airport");

        String welcomeMessage = ("\nWelcome to the Flight Ticket Application!\n") +
                "What is your purpose?\n" +
                "\n1-) Create New Flight\n" +
                "2-) Create New Ticket\n" +
                "3-) Exit!\n" +
                "\nType your choice(1-2): ";

        System.out.printf(welcomeMessage);

        Scanner scanner = new Scanner(System.in);

        int choicePurpose = scanner.nextInt();
        while (true) {
            switch (choicePurpose) {
                case (1):
                    System.out.println("case 1");
                    break;
                case (2):
                    istanbul.getLocation();
                    newYork.getLocation();
                    tokyo.getLocation();
                    beirut.getLocation();
                    madrid.getLocation();
                    System.out.printf("\nChose Flight by ID: ");
                    int choiceFlight = scanner.nextInt();
                    while (true) {
                        switch (choiceFlight) {
                            case 1:
                                istanbul.getLocation();
                                System.out.println("\nLocation Added Successfully");
                                break;
                            case 2:
                                newYork.getLocation();
                                System.out.println("\nLocation Added Successfully");
                                break;
                            case 3:
                                tokyo.getLocation();
                                System.out.println("\nLocation Added Successfully");
                                break;
                            case 4:
                                beirut.getLocation();
                                System.out.println("\nLocation Added Successfully");
                                break;
                            case 5:
                                madrid.getLocation();
                                System.out.println("\nLocation Added Successfully");
                                break;
                            default:
                                System.out.println("\nInvalid choice. Please enter a valid option.");
                                break;
                        }
                    }
                case 3:
                    System.out.println("\nExiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid choice. Please enter a valid option.");
                    break;
            }
            break;
        }
    }
}