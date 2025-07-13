class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }
}

public class Car extends Vehicle {
    Car() {
        super();  
        System.out.println("Car constructor called");
    }

    public static void main(String[] args) {
        Car c = new Car();  
        System.out.println(c);
    }
}
