public class Employee4 {
    String name;
    double salary;

    Employee4() {
        this("Unknown", 0);
        System.out.println("Default constructor called");
    }

    Employee4(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Parameterized constructor called");
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        new Employee4();  
    }
}
