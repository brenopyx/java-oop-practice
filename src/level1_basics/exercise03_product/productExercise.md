1. Objective
- Create a class to represent a product in a store, allowing control you to control the price
and quantity in stock

2. Produt Class
- Create the Product.java file with following attributes:
    * Name -> String
    * Price -> double 
    * Quantity -> Int

- Requirements:
  * All attributes must be privates
  * Create a constructor for initialize the attributes
  * Create getters and setters when necessary 
  * Don't allow negative prices
  * Don't allow negative quantity

3. Mandatory Methods
- addStock(int quantity)
   * units to inventory. Don't allow negative or zero values
- removeStock(int quantity)
  * Remove units from inventory. Don't allow negative values, zero or quantities greater than available inventory
- calculateTotalStockValue
    * Calculate the total value of available products in stock
- displayInformation()
  * Show name, price, available quantity and total value in inventory
