1. Objective
- Learning to relate objects of different class, using association 

2. Costumer Class 
- Create a class call Customer with the following attributes  
    * Name: String
    * CPF: String
    * Email: String
- Requirements   
    * All attributes must be privates
    * Create a constructor for initialize the attributes
    * Create getter to query data
    * Create a methods `showCustomerInformation()` for show the customer information
    * Don't alloy empty name, CPF or e-mail

3. BankAccount Class
- Attribute:
    * accountNumber -> String
    * customer -> Customer
    * balance -> double
- Requirements
    * All attributes must be privates
    * Create a constructor that receives an account number, an object Customer and the balance
    * Create necessary getters
    * Keep the methods  
        * deposit(double amount)
        * withdraw(double amount)
        * showBalance()
        * showAccountInformation()
    * Keep the deposit validations and balance from exercise 02
    * Don't create public setter to balance
4. Main Clas
- In Main.java:   
  * Create two objects Customer, representing different customers
  * Create two bank accounts, associating each one with the respective client
  * Show the client information
  * Show the account information
  * Make deposit and withdraw
  * Query the balance again
  