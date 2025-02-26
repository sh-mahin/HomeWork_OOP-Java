/*
Consider the following scenario:
Suppose you have pet dog. It has a name, age, breed etc. It has the following characteristics.
 It can bark, do spin, run etc.
 Now create a class for this scenario.
 */
package task87;

public class Dog {

    // Attributes
    private final String name;
    private final int age;
    private final String breed;
    private final String color;

    // Constructor to initialize the Dog object
    public Dog(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    // Method to simulate barking
    public void bark() {
        System.out.println(name + " is barking! Woof Woof!");
    }

    // Method to simulate spinning
    public void spin() {
        System.out.println(name + " is spinning around!");
    }

    // Method to simulate running
    public void run() {
        System.out.println(name + " is running!");
    }

    // Method to display the dog's details
    public void displayDogDetails() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Age: " + age + " years");
        System.out.println("Dog's Breed: " + breed);
        System.out.println("Dog's Color: " + color);
    }

    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever", "Golden");

        // Display dog details
        myDog.displayDogDetails();

        // Let the dog perform some actions
        myDog.bark();
        myDog.spin();
        myDog.run();
    }
}

