package AutoboxingAndUnboxing.BankChallenge;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Poland");
        bank.addNewBranch("Cracow");
        bank.addCustomer("Cracow", "Tom", 125.50);
        bank.addCustomer("Cracow", "Tim", 5.0);
        bank.addCustomer("Cracow", "Rob", 5000);
        bank.listCustomers("Cracow",false);
        bank.addNewBranch("Russia");
        bank.addCustomer("Russia","Sasza",3.434);
        bank.addCustomer("Russia","Olena",150);
        bank.addCustomer("Russia","Misza",12.50);
        bank.listCustomers("Russia",true);
        if(!(bank.addCustomer("Germany","Heinrich",-12)))
        {
            System.out.println("Error the branch doesn't exist");
        }
    }
}
// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions