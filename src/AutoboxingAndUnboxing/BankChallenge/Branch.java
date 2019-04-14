package AutoboxingAndUnboxing.BankChallenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    boolean
    addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false; //already exist a customer
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount); //autoboxing
            return true;
        }
        return false; //already exist a customer
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    // stara dobra petla for !!!!
//    private Customer findCustomer(String customerName) {
//        for (int i = 0; i < customers.size(); i++) {
//            if (customers.get(i).getName().equals(customerName))
//                return customers.get(i);
//        }
//        return null;
//    }
    public String getName() {
        return name;
    }
}