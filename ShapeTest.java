abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    int length = 10, breadth = 5;

    void area() {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.area();

        Shape s2 = new Rectangle();
        s2.area();
    }
}
