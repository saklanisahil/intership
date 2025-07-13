public class Employee3 {
    String name;

    Employee3(String name) {
        this.name = name; 
    }

    void show() {
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[] args) {
        Employee3 emp = new Employee3("Aashay");
        emp.show();
    }
}
