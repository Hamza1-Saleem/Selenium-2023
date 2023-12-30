package first.project;

//Abstraction program

//Abstract class representing a vehicle
abstract class Vehicle {
 // Abstract methods to be implemented by subclasses
 public abstract void start();

 public abstract void stop();

 // Concrete method in the abstract class
 public void displayInfo() {
     System.out.println("This is a vehicle.");
 }
}

//Concrete subclass 1: Car
class Car extends Vehicle {
 // Implementation of the start method for cars
 @Override
 public void start() {
     System.out.println("Car is starting.");
 }

 // Implementation of the stop method for cars
 @Override
 public void stop() {
     System.out.println("Car is stopping.");
 }
}

//Concrete subclass 2: Motorcycle
class Motorcycle extends Vehicle {
 // Implementation of the start method for motorcycles
 @Override
 public void start() {
     System.out.println("Motorcycle is starting.");
 }

 // Implementation of the stop method for motorcycles
 @Override
 public void stop() {
     System.out.println("Motorcycle is stopping.");
 }
}

public class printvariable {
 public static void main(String[] args) {
     // Create objects of different vehicles
     Vehicle car = new Car();
     Vehicle motorcycle = new Motorcycle();

     // Call the start and stop methods for each vehicle
     car.start();
     car.stop();

     motorcycle.start();
     motorcycle.stop();

     // Call the displayInfo method for each vehicle
     car.displayInfo();
     motorcycle.displayInfo();
 }
}
	