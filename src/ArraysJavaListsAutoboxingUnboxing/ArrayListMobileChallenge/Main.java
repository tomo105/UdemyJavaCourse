package ArraysJavaListsAutoboxingUnboxing.ArrayListMobileChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobile = new MobilePhone(" 555 444 333");

    public static void main(String[] args) {


        boolean play = true;
        while (play) {
            System.out.println("chose one of methods:");
            int methodNumber = scanner.nextInt();
            scanner.nextLine();
            switch (methodNumber) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobile.printListOfContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    play = false;
                    break;
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name  ");
        String name = scanner.nextLine();
        Contact newContact = mobile.queryContact(name);
        if (newContact == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("Name " + newContact.getName());

    }

    private static void updateContact() {
        System.out.println("enter existing contact to replace/update");
        String name = scanner.nextLine();
        Contact existingContact = mobile.queryContact(name);
        if (existingContact == null) {
            System.out.println("contact doesn't exist");
            return;
        }
        System.out.println("enter new name of contact");
        String nameTwo = scanner.nextLine();
        System.out.println("give a new number");
        String numberTwo = scanner.nextLine();
        Contact newContact = Contact.CreateContact(nameTwo, numberTwo);
        if (mobile.updateContacts(existingContact, newContact)) {
            System.out.println("succes updated");
        } else {
            System.out.println("failed to update");
        }
    }

    private static void removeContact() {
        System.out.println("enter existing contact to remove");
        String name = scanner.nextLine();
        Contact contact = mobile.queryContact(name);
        if (contact == null) {
            System.out.println("contact doesn't exist");
            return;
        }
        if (mobile.removeContact(contact)) {
            System.out.println("deleted");
        } else {
            System.out.println("failed to delete");
        }
    }

    private static void addNewContact() {
        System.out.println("tell me your name");
        String name = scanner.nextLine();
        System.out.println("and your mobile number ");
        String number = scanner.nextLine();
        Contact contact = Contact.CreateContact(name, number);
        if (mobile.addNewContact(contact)) {
            System.out.println("added new contact" + contact.getName());
        } else
            System.out.println("failed to add new contact");
    }


    private static void printOptions() {
        System.out.println("click 0 to print options ");
        System.out.println("click 1 to print list of contacts  ");
        System.out.println("click 2 to add new contact");
        System.out.println("click 3 to remove existing contact");
        System.out.println("click 4 to modify existing contact");
        System.out.println("click 5 to check if the contact already exist");
        System.out.println("click 6 to quit");
    }


}
