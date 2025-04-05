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