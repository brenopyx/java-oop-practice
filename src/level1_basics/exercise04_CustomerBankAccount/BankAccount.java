package level1_basics.exercise04_CustomerBankAccount;

public class BankAccount {
    private String accountNumber;
    private Customer customer;
    private double balance;

    public BankAccount(String accountNumber, Customer customer, double balance) {
        this.setAccountNumber(accountNumber);
        this.setCustomer(customer);
        this.setBalance(balance);
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("A bank account must have a customer");
        } else {
            this.customer = customer;
        }
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            throw new IllegalArgumentException("The balance value is  invalid");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("The number is invalid");
        } else {
            this.accountNumber = accountNumber;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " successful");
        } else {
            System.out.println("The enter value is invalid");
        }
    }

    public void withdraw(double amount) {
        if (amount <= this.getBalance() && amount > 0) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount +  " successful");
        } else {
            System.out.println("You don't have sufficient balance");
        }
    }

    public void showAccountInformation() {
        System.out.println("---Bank Account Information---");
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance Current: " + getBalance());
        customer.showCustomerInformation();
        System.out.println("--------------------------------");
    }
}
