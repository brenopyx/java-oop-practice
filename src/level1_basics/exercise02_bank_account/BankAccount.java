package level1_basics.exercise02_bank_account;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.setAccountNumber(accountNumber);
        this.setOwnerName(ownerName);
        this.setBalance(balance);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("The balance value is invalid");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
        System.out.println("Account Owner: " + getOwnerName());
        System.out.println("Balance Current: " + getBalance());
        System.out.println("--------------------------------");
    }

}
