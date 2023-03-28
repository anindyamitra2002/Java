class Parent101{
    void compute(int a, int b){
        System.out.println("Sum(Parent):");
        System.out.println(a + b);
    }
    void compute(int a, int b, int c){
        System.out.println("Sum(Parent):");
        System.out.println(a + b + c);
    }
}
class Child101 extends Parent101{
    void compute(double a, double b){
        System.out.println("Sum(Child):");
        System.out.println(a + b);
    }
    void compute(double a, double b, double c){
        System.out.println("Sum(Child):");
        System.out.println(a + b + c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Child101 c = new Child101();
        c.compute(2,3,8);
    }
}
