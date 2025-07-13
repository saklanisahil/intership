public class NonStaticDemo {
    void greet() {
        System.out.println("Hello from non-static method!");
    }

    public static void main(String[] args) {
        NonStaticDemo obj = new NonStaticDemo(); 
        obj.greet(); 
    }
}
