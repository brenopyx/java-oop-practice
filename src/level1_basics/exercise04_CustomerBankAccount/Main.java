package level1_basics.exercise04_CustomerBankAccount;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Joao", "123456", "joao@email.com");
        Customer customer2 = new Customer("Ana", "654321", "ana@email.com");

        BankAccount account1 = new BankAccount("001", customer1, 1000);
        BankAccount account2 = new BankAccount("002", customer2, 5000);

        account1.deposit(200);
        account1.withdraw(400);
        account1.showAccountInformation();
    }
}
