package level1_basics.exercise02_bank_account;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("123", "Joao", 1000);
        BankAccount bankAccount2 = new BankAccount("654", "Ana", 0);


        bankAccount1.showAccountInformation();
        bankAccount1.deposit(250);
        bankAccount1.withdraw(100);
        bankAccount1.showAccountInformation();

        bankAccount2.showAccountInformation();
        bankAccount2.deposit(200);
        bankAccount2.withdraw(3000);
        bankAccount2.showAccountInformation();

    }
}
