package ArraysJavaListsAutoboxingUnboxing.ArrayListMobileChallenge;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }


    public boolean addNewContact(Contact contact) {

        if (findContact(contact) >= 0) {
            System.out.println("You have this contact in your Contacts");
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContacts(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            System.out.println("update old contact" + oldContact + " to new: " + newContact);
            this.contacts.set(index, newContact);
            return true;
        }
        System.out.println("You don't have " + oldContact + ".. so you can't replace it");
        return false;
    }


    private int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }//return contact index if exist else return -1

    private int findContact(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(contactName))
                return 1;
        }
        return 0;
    }//return index of contact with specified name

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            System.out.println(contact.getName() + " was found and remove");
            return this.contacts.remove(contact);
        }
        System.out.println(contact.getName() + "you haven't got this contact so you can't remove it");
        return false;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return this.contacts.get(index);
        }
        return null;
    }

    public void printListOfContacts() {
        if (this.contacts.size() == 0) {
            System.out.println("Your contacts are empty as your pockets xd");
            return;
        }

        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            System.out.println("my contact nr: " + i + " " + contact.getName() + " " + contact.getPhoneNumber());
        }
    }


}
