class Car {
    void startEngine() {
        System.out.println("Car engine started");
    }
}

public class Bike extends Car {
    void ride() {
        System.out.println("Bike is riding");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.startEngine();  
        b.ride();         
    }
}
