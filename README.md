
# Java Assignment

## 196410 Kambale Mulumba Enock
## 194028 Nshokano Mirindi Justin

Explanation of each class type:

1. Interface: 
A Java interface specifies a contract for classes to follow, with methods that must be implemented. 
In our example, the Device interface specifies two methods, turnOn() and turnOff(). The class implementing the Device 
interface must provide concrete implementations of these methods. 
There is no method body in the interface, but only the method signatures.

2. Abstract Class:
An abstract class is a class which can't be directly instantiated but could be extended by other classes. 
It could also contain abstract methods (without any implementation) or concrete methods (with implementation). 
In the example given above, car is an abstract class which extends the Device interface and has a concrete method, 
runDiagnostics().
This method is shared by all subclasses of the car, while the turnOn() and turnOff() should be implemented in each 
subclass. 

3. Concrete Class:
A concrete class is a class that can be instantiated and provides implementations of all 
inherited abstract methods.
The Pickup class inherits the car abstract class and implements methods of the Device interface. It provides the actual 
implementation of turnOn() and turnOff() methods that are required by the interface and can be utilized to instantiate 
objects like myPickup in the main method. The Pickup class is now ready to be utilized to instantiate objects that are able 
to run diagnostics and can be turned on/off. 


``` java
// Abstract Class: car
abstract class car implements Device {
    String brand;

    // Constructor
    car(String brand) {
        this.brand = brand;
    }

    // Concrete method: A shared feature for all cars
    void runDiagnostics() {
        System.out.println(brand + " is being checked.");
    }
}

// Concrete Class: Pickup
class Pickup extends car {
    
    // Constructor
    Pickup(String brand) {
        super(brand);
    }

    // Implementing turnOn() method from interface
    @Override
    public void turnOn() {
        System.out.println(brand + " Pickup is starting up.");
    }

    // Implementing turnOff() method from interface
    @Override
    public void turnOff() {
        System.out.println(brand + " Pickup is turnning off.");
    }
}

// Interface: Device behaviors
interface Device {
    void turnOn();  // Power on the device
    void turnOff(); // Power off the device
}

// Testing
public class Main {
    public static void main(String[] args) {
        Pickup myPickup = new Pickup("HILUX"); // Creating a Pickup object

        myPickup.runDiagnostics(); // Inherited from car
        myPickup.turnOn();         // Implemented from interface
        myPickup.turnOff();        // Implemented from interface
    }
}
```
