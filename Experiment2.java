class Vehicle {
    String make, model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(make + " " + model + " (" + year + ")");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year) {
        super(make, model, year); // using super
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year) {
        super(make, model, year); // using super
    }
}

public class Experiment2 {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 2020);
        Motorcycle bike = new Motorcycle("Yamaha", "R15", 2021);
        car.display();
        bike.display();
    }
}