package AutoboxingAndUnboxing.BankChallenge;


import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();

    }

    boolean addNewBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch existBranch = findBranch(branchName);
        if (existBranch != null) {
            return existBranch.addNewCustomer(customerName, initialAmount);
        }
        System.out.println("can't add customer cause branch doesn't exist");
        return false;
    }

    boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch existBranch = findBranch(branchName);
        if (existBranch != null) {
            return existBranch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String nameBranch) {
        for (Branch branch : this.branches) {
            if (branch.getName().equals(nameBranch))
                return branch;
        }
        return null;
    }

    boolean listCustomers(String branchName, boolean showTransitions) {
        Branch existBranch = findBranch(branchName);
        if (existBranch != null) {
            System.out.println("\nCustomers details of branch " + existBranch.getName());
            ArrayList<Customer> branchCustomer = existBranch.getCustomers();
            for (int i = 0; i < branchCustomer.size(); i++) {
                System.out.println("Customer " + i + " is: " + branchCustomer.get(i).getName());
                if (showTransitions) {
                    System.out.println("\nList of Transactions ");
                    ArrayList<Double> transactions = branchCustomer.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println(j + " transaction " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}