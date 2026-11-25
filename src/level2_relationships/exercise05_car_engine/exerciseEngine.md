1. Engine Class
- Represent the engine of a vehicle 
    * Model -> String
    * horsePower -> int
- Methods
    * Constructor to initialize the attributes 
    * Getter to query the attributes
    * `showEngineInformation()` show the information of the engine
- Rules
    * The model don't be empty
    * The power must bigger than zero
    * Don't make available public setters unnecessarily
2. Car Class
- Represent an automobile that has an engine 
    * brand -> String
    * model -> String
    * engine -> Engine
- Methods
  * Constructor  to initialize  the attributes
  * Necessary getters
  * `showCarInformation()` show car information and it calls the engine display method
- Rule
  * The brand don't be empty
  * The model don't be empty
  * All cars must have an engine 
  * Don't allow a car to be created without a valid engine object