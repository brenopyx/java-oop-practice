1. Objective 
- Develop a class to represent a bank account, allowing you to perform financial transactions
and control access to your datas 
- The main goal is pratice encapsulation, constructors, methods, validations
  and state management of an object

2. Bank class requirements class:
```
accountNumber -> String
ownerName -> String
balance -> Number
```
* Constructor must initialize the attributes and ensure that the initial balance is not
negative

Mandatory Methods
-
1. Deposit(double amount)
   * Make a deposit into the account
     * Rules:

       → The value must be greater than 0   
       → The balance should be updated after the deposit    
       → Don't allow invalid deposit
     
2. withdrawal(double amount)
    * Make a withdrawal  
      * Rules:   
        → The value must be greater 0  
        → The value can't be higher than the available balance  
        → The balance should be updated after the withdrawal

3. showBalance()  
    * Show the balance account

4. showAccountInformation()
    * Show the information account
        * Account number
        * Account owner
        * Balance current

5. Main requirements
   * Create at least two bank account
   * Show the account information
   * Make deposit
   * Make withdrawal
   * Try to make a withdrawal higher than balance
   * Try to make a deposit with negative value
   * Query the balance after transactions