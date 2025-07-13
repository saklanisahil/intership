interface Animal {
    void sound();
}

public class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
