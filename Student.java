class Person {
    String role = "Person";
}

public class Student extends Person {
    String role = "Student";

    void showRoles() {
        System.out.println("Role in child class: " + role);
        System.out.println("Role in parent class: " + super.role); 
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.showRoles();
    }
}
