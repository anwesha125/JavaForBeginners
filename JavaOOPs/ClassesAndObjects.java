class Car {
    // state (attributes)
    String brand;
    String type;
    String colour;
    int speed;


// Constructor e

public Car(String brand, String type, String colour, int speed){
    this.brand = brand;
    this.type = type;
    this.colour = colour;
    this.speed = 0; // Initial speed is at 0;    
}

// behaVIOUR(METHODS)

// method to increase speed
public void increaseSpeed(int increment){
    speed += increment;
    System.out.println("Speed increased to: " + speed + " km/hr");
}

// method to apply brake (by decreasing speed)
public void applyBrake(int decrement){
    speed -= decrement;
    if(speed < 0){
        speed = 0; // speed cannot be negative
        }
    System.out.println("Speed decreased to: " + speed + " km/hr");
}

// method to display current speed
public void displaySpeed(){
    System.out.println("The "+brand+" is driving at: " + speed + " km/hr");
}

// method to display car details
public void displayDetails(){
    //Car myCar = new Car("Toyota", "Sedan", "Black", 0);
    // myCar.brand = "Toyota";
    // myCar.type = "Sedan";
    // myCar.colour = "Black";
    // myCar.speed = 120;
    System.out.println("Car Details:");
    System.out.println("Brand: " + brand);
    System.out.println("Type: " + type);
    System.out.println("Colour: " + colour);
    System.out.println("Speed: " + speed + " km/hr");
}
}

// Main Class to test the Car Class
public class ClassesAndObjects {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car("Toyota", "Sedan", "Black", 0);

        // Display initial details
        myCar.displayDetails();

        // Increase speed
        myCar.increaseSpeed(50);
        myCar.displaySpeed();

        // Apply brake
        myCar.applyBrake(20);
        myCar.displaySpeed();
    }
}