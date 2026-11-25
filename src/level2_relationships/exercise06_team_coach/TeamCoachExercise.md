1. Objectve
- Create a relationship between two class where one object uses another, but both have
independent life cycles

2. Coach Class
- Represent a coach
    * Name -> String
    * ExperienceYears -> int
- Methods
    * Constructor
    * Getters
    * `showCoachInformation()`
- Rules
    * Name can't be empty
    * Experience Years can't be negative
    * Don't make available unnecessarily public setters
3. Team Class
- Represent a sport team
    * Name -> String
    * Coach -> Coach
- Methods 
    * Constructor
    * Necessary getters
    * `showTeamInformation()`
- Rules 
    * Team name can't be empty
    * All team must have a valid coach
    * The Object Coach must be received by constructor, and not create within Team.