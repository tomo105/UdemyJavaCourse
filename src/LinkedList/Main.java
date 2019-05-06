package LinkedList;

import org.omg.PortableInterceptor.INACTIVE;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<String> lista =  new ArrayList(3);
//        lista.add("ala");
//        lista.add("ma");
//        lista.add("kota");
//        System.out.println(lista.size());
//        lista.remove(2);
//        System.out.println(lista.size());
//        String napis = lista.get(1);
//        System.out.println(napis);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
//        String date = sdf.format(new Date());
//        System.out.println(date); //15/10/2013
        Customer customer = new Customer("rob", 34);
        Customer secondcustomer = customer;
        secondcustomer.setBalance(20);
        secondcustomer.setName("tom");
        System.out.println("welcome " + customer.getName() + "is " + customer.getBalance());
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i).intValue());
        }
        intList.add(1,2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i).intValue());
        }

    }


}
