package OS;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Phone samsung = new Phone(305305300);

    public static void addContact(Phone phone) {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        int number = scanner.nextInt();
        phone.createContact(number, name);
    }

    public static void findContact(Phone phone) {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        phone.getContact(name);
    }

    public static void removeContact(Phone phone) {
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        phone.removeContact(name);
    }

    public static void updateContact(Phone phone) {
        System.out.println("Which Contact?");
        String name = scanner.nextLine();
        if  (phone.getContact(name) == null) {
            //nothing, it already prints it out
        } else {
            System.out.println("Update how?:\n" +
                    "1 - Just Name.\n" +
                    "2 - Just Phone Number.\n" +
                    "3 - Both the Name and Phone Number");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter new contact name: ");
                    String newName = scanner.nextLine();
                    phone.changeContact(name, newName);
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.println("Enter new contact number: ");
                    int newNumber = scanner.nextInt();
                    phone.changeContact(name, newNumber);
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.println("Enter new contact name: ");
                    String newName1 = scanner.nextLine();
                    //scanner.nextLine();
                    System.out.println("Enter new contact phone number: ");
                    int newNumber1 = scanner.nextInt();
                    phone.changeContact(name, newNumber1, newName1);
                    break;

                default:
                    System.out.println("Incorrect Input!");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        samsung.setPoweredUp(true);

        while(samsung.isPoweredUp()) {
            samsung.menu();
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting Down...");
                    samsung.setPoweredUp(false);
                    break;

                case 1:
                    samsung.getMyContacts();
                    break;

                case 2:
                    addContact(samsung);
                    break;

                case 3:
                    updateContact(samsung);
                    break;

                case 4:
                    removeContact(samsung);
                    break;

                case 5:
                    findContact(samsung);
                    break;

                case 6:
                    break;

                default:

                    break;
            }
        }


    }

}
