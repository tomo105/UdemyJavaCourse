package ArraysJavaListsAutoboxingUnboxing.MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter a number (integer) count: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        int[] myReturnedArray = readIntegers(num);
        System.out.println(findMin(myReturnedArray));
        System.out.println(findMax(myReturnedArray));
        System.out.println(findMin2(myReturnedArray));

    }

    private static int[] readIntegers(int count) {
        int[] tab = new int[count];
        for (int i = 0; i < tab.length; i++) {
            System.out.println("enter a number (integer): ");
            int number = scanner.nextInt();
            scanner.nextLine();
            tab[i] = number;
        }
        return tab;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int val : array) {
            if (val < min)
                min = val;
        }
        return min;
    }

    private static int findMin2(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i + 1]) {
                min = array[i + 1];
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i + 1]) {
                max = array[i + 1];
            }
        }
        return max;
    }
}
//*-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//-Finally, print the minimum element in the array.
//
//Tips:
//	-Assume that the user will only enter numbers, never letters
//	-For simplicity, create a Scanner as a static field to help with data input
//	-Create a new console project with the name eMinElementChallengef*/