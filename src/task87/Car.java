package task87;/*
 Consider the following scenario:
A car has these following attributes. It has an owner, brand name, serial number etc. It also has these
following functionalities. You can start/stop a car, its fuel can be checked etc.
 Now design a Class for this scenario.
 */

public class Car {

    // Attributes
    private final String owner;
    private final String brand;
    private final String serialNumber;
    private double fuelLevel; // Percentage (0 to 100)
    private boolean isRunning;

    // Constructor to initialize the car object
    public Car(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false; // Initially, the car is not running
    }

    // Method to start the car
    public void startCar() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("The car has started.");
        } else {
            System.out.println("Cannot start the car. Fuel is empty.");
        }
    }

    // Method to stop the car
    public void stopCar() {
        isRunning = false;
        System.out.println("The car has stopped.");
    }

    // Method to check the fuel level
    public double checkFuel() {
        return fuelLevel;
    }

    // Method to refuel the car
    public void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            if (fuelLevel > 100) {
                fuelLevel = 100; // Maximum fuel capacity
            }
            System.out.println("The car has been refueled. Current fuel level: " + fuelLevel + "%");
        } else {
            System.out.println("Invalid refuel amount.");
        }
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("task87.Car Owner: " + owner);
        System.out.println("task87.Car Brand: " + brand);
        System.out.println("task87.Car Serial Number: " + serialNumber);
        System.out.println("Fuel Level: " + fuelLevel + "%");
        System.out.println("Is the car running? " + (isRunning ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Create a car object
        Car myCar = new Car("John Doe", "Toyota", "ABC12345", 50);

        // Display car details
        myCar.displayCarDetails();

        // Start the car
        myCar.startCar();

        // Check fuel
        System.out.println("Current Fuel Level: " + myCar.checkFuel() + "%");

        // Refuel the car
        myCar.refuel(30);

        // Stop the car
        myCar.stopCar();

        // Display updated car details
        myCar.displayCarDetails();
    }
}
