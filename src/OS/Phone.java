package OS;

import java.util.ArrayList;

public class Phone {

    //NOTE: better to check if that contact exist, then pass the index to remove, modify, etc. :D

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    private int myPhoneNumber;

    public Phone(int number) {
        this.myPhoneNumber = number;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public int getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void createContact(int number, String name){
        Contact contact = new Contact(number, name);

        contacts.add(contact);
    }

    public void createContact(int number){
        Contact contact = new Contact(number);
        //Could of used "this(number, "unknown");", but I kinda made the overloaded method in Contact class :P
        contacts.add(contact);
    }

    public void getMyContacts() {

        System.out.println("Your Contacts are :");

        for (int i = 0; i < contacts.size(); i++) {

            System.out.println((i+1) + "." + contacts.get(i));

        }

    }

    public Contact getContact(int number){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getPhoneNumber() == number){
                return contacts.get(i);
            }

        }

        return new Contact(0000000000, "Error");
    }

    public Contact getContact(String name){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getName() == name){
                return contacts.get(i);
            }

        }

        return new Contact(0000000000, "Error");

    }

    public void removeContact(int number){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getPhoneNumber() == number){
                Contact thisContact = contacts.get(i);
                System.out.println(thisContact.getName() + "with the phone-number " + thisContact.getPhoneNumber() + " was removed!");
                contacts.remove(i);
            }

        }
        System.out.println("Not found!");
    }

    public void removeContact(String name){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getName() == name) {
                Contact thisContact = contacts.get(i);
                System.out.println(thisContact.getName() + "with the phone-number " + thisContact.getPhoneNumber() + " was removed!");
                contacts.remove(i);
            }

        }
        System.out.println("Not found!");
    }

    public Contact changeContact(int number, int newNumber, String newName){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getPhoneNumber() == number){
                Contact thisContact = contacts.get(i);
                thisContact.setName(newName);
                thisContact.setPhoneNumber(newNumber);
                return thisContact;
            }

        }

        return new Contact(0000000000, "Error");
    }

    public Contact changeContact(int number, int newNumber){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getPhoneNumber() == number){
                Contact thisContact = contacts.get(i);
                thisContact.setPhoneNumber(newNumber);
                return thisContact;
            }

        }

        return new Contact(0000000000, "Error");
    }

    public Contact changeContact(int number, String newName){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getPhoneNumber() == number){
                Contact thisContact = contacts.get(i);
                thisContact.setName(newName);
                return thisContact;
            }

        }

        return new Contact(0000000000, "Error");
    }

    public Contact changeContact(String name, int newNumber, String newName){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getName() == name){
                Contact thisContact = contacts.get(i);
                thisContact.setName(newName);
                thisContact.setPhoneNumber(newNumber);
                return thisContact;
            }

        }

        return new Contact(0000000000, "Error");

    }



    public Contact changeContact(String name, int newNumber){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getName() == name){
                Contact thisContact = contacts.get(i);
                thisContact.setPhoneNumber(newNumber);
                return thisContact;
            }

        }

        return new Contact(0000000000, "Error");

    }


    public Contact changeContact(String name, String newName){

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getName() == name){
                Contact thisContact = contacts.get(i);
                thisContact.setName(newName);
                return thisContact;
            }

        }

        return new Contact(0000000000, "Error");

    }

    public void menu() {
        System.out.println();
        System.out.println();
    }



    public static void main(String[] args) {

    }

}
