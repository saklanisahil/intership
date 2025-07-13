public class OverloadExample {
    void display() {
        System.out.println("No parameters");
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(int age, String city) {
        System.out.println("Age: " + age + ", City: " + city);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display();
        obj.display("Aashay");
        obj.display(21, "Pune");
    }
}
