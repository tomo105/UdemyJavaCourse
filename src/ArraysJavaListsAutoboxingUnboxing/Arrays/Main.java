package ArraysJavaListsAutoboxingUnboxing.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = {106, 26, 81, 5, 15};
        printArray(myArray);
        System.out.println();
        int[] sorted = sortIntegers(myArray);
        printArray(sorted);
        System.out.println("myPrintArray"+ Arrays.toString(sorted));
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("my array consist at " + i + " : the number " + array[i]);
    }

    public static int[] getIntegers(int size) {
        int[] tab = new int[size];
        System.out.println("give me " + size + " number");
        for (int i = 0; i < tab.length; i++)
            tab[i] = scanner.nextInt();
        return tab;
    }

    public static int[] sortIntegers(int[] tab) {
        int[] tempTab = new int[tab.length];
        int size = tab.length; //ile liczb
        while (size > 0) {
            int tempNum = 0;
            int tempIter = 0;
            for (int i = 0; i < tab.length; i++) {
                if (tab[i] > tempNum) {
                    tempNum = tab[i];
                    tempIter = i;
                }
            }
            tempTab[tab.length - (size--)] = tempNum;
            tab[tempIter] = 0;

        }
        return tempTab;
    }
}

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.