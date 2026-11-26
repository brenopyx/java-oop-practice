1. Problem Statement
   The system must ensure that all temperature changes follow the defined business rules.
2. Initial Configuration
   When a TemperatureController object is created, it must use the following initial values:
   Attribute	Initial value
   currentTemperature	25°C
   desiredTemperature	25°C
   minimumTemperature	0°C
   maximumTemperature	100°C

These limits must remain constant throughout the object's lifetime.
3. Attributes
   The TemperatureController class must contain the following attributes:
   Attribute	Description
   currentTemperature	The machine's actual temperature.
   desiredTemperature	The temperature configured by the operator.
   minimumTemperature	The minimum allowed temperature (0°C).
   maximumTemperature	The maximum allowed temperature (100°C).

Encapsulation requirements:
- All attributes must be declared as private.
- No external class should be able to modify these attributes directly.
- The minimum and maximum temperatures must never change after object creation.
- Do not create setters for the temperature attributes.
4. Business Rules
   Rule 1 — Set desired temperature
   Create a method:

setTemperature(double newTemperature)

Requirements:
- The new temperature must be greater than or equal to 0°C.
- The new temperature must be less than or equal to 100°C.
- If the value is valid, update desiredTemperature.
- If the value is invalid, reject the operation without changing the existing value.
  Rule 2 — Increase desired temperature
  Create a method:

increaseTemperature(double value)

Requirements:
- The value must be greater than zero.
- The increase must not cause desiredTemperature to exceed 100°C.
- If the operation is valid, update desiredTemperature.
- Otherwise, reject the operation without changing its value.
  Rule 3 — Decrease desired temperature
  Create a method:

decreaseTemperature(double value)

Requirements:
- The value must be greater than zero.
- The decrease must not cause desiredTemperature to fall below 0°C.
- If the operation is valid, update desiredTemperature.
- Otherwise, reject the operation without changing its value.
  Rule 4 — Update current temperature
  Create a method:

updateCurrentTemperature(double newTemperature)

Requirements:
- The new temperature must be between 0°C and 100°C, inclusive.
- If the value is valid, update currentTemperature.
- If the value is invalid, reject the operation without changing the existing value.
  For this exercise, assume that this method represents a temperature reading received from a machine sensor.
  Rule 5 — Retrieve temperature information
  Create methods to retrieve:
- Current temperature.
- Desired temperature.
- Minimum temperature.
- Maximum temperature.
  These methods must allow external classes to read the information without modifying the object's internal state.