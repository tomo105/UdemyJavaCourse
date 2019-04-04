package ArraysJavaListsAutoboxingUnboxing.previewArrays;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //--
        int[] myTab = {1, 20, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] myDoubleArray = new double[5];
        System.out.println(myTab[9]);
        for (int i = 0; i < myDoubleArray.length; i++)
            myDoubleArray[i] = 32 + i;
        printArray(myDoubleArray);
        //---
        System.out.println("the average of array is "+getAverage(myTab));
        int[] a = getInegers(4);
        printArray(a);
        int[] ad = new int[45];
        ad[4]=9;
        printArray(ad);

    }

    public static int[] getInegers(int size) {
        System.out.println("enter " + size + " integer value\r");
        int[] values = new int[size];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum+=array[i];

        return (double)sum/(double) array.length;
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("my array have: " + i + " = " + array[i]);

    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println("my array have: " + i + " = " + array[i]);

    }
}
