package ArraysJavaListsAutoboxingUnboxing.ListAndListArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    //konstruktor klasy ArrayList
    public void addGroceryList(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have " + groceryList.size() + " elements" +
                "in your list ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " " + groceryList.get(i));
        }
    }

    public void modifyGRoceryList(int position, String relpacement) {
        groceryList.set(position, relpacement);
        System.out.println("modify grocery list");
    }

    public void removeGroceryList(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);

    }

    public String findItem(String search) {
        //boolean exists =  groceryList.contains(search);

        int position = groceryList.indexOf(search);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }


}
