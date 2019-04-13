package AutoboxingAndUnboxing;

import java.util.ArrayList;

//WRAPPER TO INT !!!!!!!!!!!!!!!!!
class intClass {
    private int value;

    intClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        //----------------------------------------------------------------------------------ArrayList<> with class of primitive types using additional class
         String[] strArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("tim");

        ArrayList<intClass> intaa = new ArrayList<>();
        intaa.add(new intClass(214323));
        System.out.println(intaa.get(0).getValue());

        Integer integer = new Integer(3456);
        Double doubleValue = new Double(3.23);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i)); //autoboxing
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(integerArrayList.get(i).intValue());
        }                                       //unboxing from
//---------------------------------------------------------------------------------------------------int vs Integer
        Integer myInt = 45;
        //compiler change this to int--> Integer
        // Integer intValue = Integer.valueOf(45);

        int r = myInt;
        // on the other side  Integer -->int
        // int r = myInt.intValue();

//-----------------------------------------------------------------------------------------------arrayListDouble
        // commented actual acting of compiler but it's
        // a thing that is done automatically!!!
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (double i = 0; i <= 10.0; i += 0.5) {
            doubleArrayList.add(i);
            //   doubleArrayList.add(Double.valueOf(i)); //autoboxing
        }
        doubleArrayList.remove(5);

        for (int i = 0; i < doubleArrayList.size(); i++) {
            double value = doubleArrayList.get(i);
            // double value = doubleArrayList.get(i).doubleValue();//unboxing
            System.out.println(i + "--> " + value);
        }
    }

    //easy way to use primitive types in arrayList
    //String is a class
    // Integer is a class
    //Double is a class


}
