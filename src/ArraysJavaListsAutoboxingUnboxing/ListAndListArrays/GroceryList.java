package ArraysJavaListsAutoboxingUnboxing.ListAndListArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //konstruktor klasy ArrayList
    void addGroceryList(String item) {
        groceryList.add(item);
    }

    void printGroceryList() {
        System.out.println("you have " + groceryList.size() + " elements " +
                "in your list ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + " " + groceryList.get(i));
        }
    }

    void modifyGroceryList(String currentItem, String relpacement) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryList(position, relpacement);
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    private void modifyGroceryList(int position, String relpacement) {
        groceryList.set(position, relpacement);
        System.out.println("modify grocery list");
    }

    void removeGroceryList(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryList(position);
        }
    }

    private void removeGroceryList(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);

    }

    private int findItem(String search) {
        return groceryList.indexOf(search);//return position of
    }

    boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }

}
