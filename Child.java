class Parent {
    void showParent() {
        System.out.println("This is Parent class");
    }
}

public class Child extends Parent {
    void showChild() {
        System.out.println("This is Child class");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.showParent();  
        c.showChild();   
    }
}
