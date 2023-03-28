import java.util.Scanner;

class GreatGrandParent {
    double Pi = 3.14;

    void compute() {
        System.out.println("we are in great grandparent");
    }
}

class GrandParent extends GreatGrandParent{
    double Pi = 3.14;

    void compute() {
        super.compute();
        System.out.println("we are in grandparent");
    }
}

class Parent1 extends GrandParent {
    double Pi = 3.14;

    void compute() {
        super.compute();
        System.out.println("we are in parent");
    }
}

class Child extends Parent1 {
    double radius;
    double area;
    Scanner sc = new Scanner(System.in);

    void compute() {
        super.compute();
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
        area = Pi * radius * radius;
        System.out.println("The area is: " + area);
    }
}

public class TestInherit {
    public static void main(String[] args) {
        Child c = new Child();
        c.compute();
    }
}
