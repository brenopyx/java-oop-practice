package level1_basics.exercise02_bank_account;

public class Bank {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Bank(String accountNumber, String ownerName, double balance) {
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

    public void setBalance(double balance) {
        if (balance > 0) {
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
}
