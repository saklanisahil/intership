interface Taxable {
    void payTax();
}

abstract class Person {
    abstract void displayInfo();
}

public class Employee extends Person implements Taxable {
    public void displayInfo() {
        System.out.println("Employee information");
    }

    public void payTax() {
        System.out.println("Tax paid by Employee");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayInfo();
        emp.payTax();
    }
}
