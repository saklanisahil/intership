interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

public class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies");
    }

    public void swim() {
        System.out.println("Duck swims");
    }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
