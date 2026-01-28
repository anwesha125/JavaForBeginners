# Encapsulation

The process of wrapping the data and code which is acting on the data together into a single unit is called as Encapsulation.

 we can achieve the encapsulation by creating the variables of class as private and create the getter and setter method as public to view and modify the variables. it is also known as data hiding.

## Advantages

- loosely coupled code.
- Better access control & security.



here in this example we are creating the variables of the class as private so other classes can’t access them.

this concept is called the encapsulation. 

and we provide the getter and method to modify and view the value of the variables. It provides you the control over the data.

Suppose you want to set the value of age which should be greater than 18 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

## With encapsulation:

- The fields are private, so they cannot be accessed directly from outside the class
- Access is provided through public getter and setter methods
- The setter methods include validation to ensure data integrity
- Invalid values are rejected, keeping the object in a valid state

## 🔄 Getters and Setters: The Access Points
Getter and setter methods are the controlled access points to your encapsulated data. They allow you to:

- **Read data** (getters)
- **Write data** (setters)
- **Validate data** before storing it
- **Transform data** if needed
- **Maintain invariants** (rules that should always be true for your object)

## Naming Conventions for Getters and Setters
Java follows a standard naming convention for getters and setters:

- Getters: `getFieldName()` (for boolean fields, sometimes `isFieldName()`)
- Setters: `setFieldName(Type value)`