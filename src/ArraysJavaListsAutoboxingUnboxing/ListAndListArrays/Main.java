package ArraysJavaListsAutoboxingUnboxing.ListAndListArrays;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //przskakuje o linijke
            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstruction() {
        System.out.println("\n Press");
        System.out.println("0 to print choise option ");
        System.out.println("1 to print groceryList ");
        System.out.println("2 to add new item to the list");
        System.out.println("3 to modify item in list");
        System.out.println("4 to remove item");
        System.out.println("5 to search for an item");
        System.out.println("6 to quit");
    }

    public static void addItem() {
        System.out.println("please enter the grocery item which you want to add : ");
        groceryList.addGroceryList(scanner.nextLine());

    }

    public static void modifyItem() {
        System.out.println("enter item position 0-...");
        int item = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter new item ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(item, newItem);
    }

    public static void removeItem() {
        System.out.println("enter item position to remove  0-...");
        int item = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryList(item);
    }

    public static void searchForItem() {
        System.out.println("enter item to search for: ");
        String seachItem = scanner.nextLine();
        if (groceryList.findItem(seachItem) != null)
            System.out.println("I found this object");
        else
            System.out.println("I didn't find these object in my array ");


    }
}
