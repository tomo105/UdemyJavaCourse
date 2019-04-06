package ArraysJavaListsAutoboxingUnboxing.ListAndListArrays;

import java.util.ArrayList;
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
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;

            }
        }
    }
    //----------------------------------------METHODS-------------------------------------------------------
    //how to copy a ArrayList easy
    private static void processArrayList() {
        //1
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList()); //da nam cala kopie grocerylist przez getera
        groceryList.printGroceryList();

        //2 in one moment
        ArrayList<String> nextrray = new ArrayList<String>(groceryList.getGroceryList());
        groceryList.printGroceryList();
        //3 arraylist to array convertion
        String[] myArray = new String[groceryList.getGroceryList().size()]; //initialize
        myArray = groceryList.getGroceryList().toArray(myArray);
        groceryList.printGroceryList();
    }



    private static void printInstruction() {
        System.out.println("\n Press");
        System.out.println("0 to print choise option ");
        System.out.println("1 to print groceryList ");
        System.out.println("2 to add new item to the list");
        System.out.println("3 to modify item in list");
        System.out.println("4 to remove item");
        System.out.println("5 to search for an item");
        System.out.println("6 to process the array");
        System.out.println("7 to quit");
    }

    private static void addItem() {
        System.out.println("please enter the grocery item which you want to add : ");
        groceryList.addGroceryList(scanner.nextLine());

    }

    private static void modifyItem() {
        System.out.println("current item name: ");
        String item = scanner.nextLine();
        scanner.nextLine();
        System.out.println("enter new item ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryList(item, newItem);
    }

    private static void removeItem() {
        System.out.println("enter item name to remove ");
        String item = scanner.nextLine();
        groceryList.removeGroceryList(item);
    }

    private static void searchForItem() {
        System.out.println("enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("I found this item !!!!!!!");
        } else {
            System.out.println("I didn't find these object in my array ");
        }

    }
}
