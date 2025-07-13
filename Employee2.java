public class Employee2 {
    String name;
    double salary;

    Employee2() {
        System.out.println("Default constructor called");
    }

    Employee2(String name) {
        this.name = name;
        System.out.println("Name set: " + name);
    }

    Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        new Employee2();
        new Employee2("Aashay");
        new Employee2("Aashay", 60000);
    }
}
