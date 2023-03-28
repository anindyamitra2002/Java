
class GrandFather{
    public int x = 5;
    void show(){
        System.out.println("hi");
    }
}
abstract class Father extends GrandFather{
    abstract void eyeColor();
}

final class Child11 extends Father{
    int y = 9;
    void printX(){
        System.out.println(x);
    }
    void eyeColor(){
        System.out.println("hello");
    }

}
public class TestNonAccessModifier {
    public static void main(String[] args) {
        Child11 c = new Child11();
        c.printX();
        c.eyeColor();
    }
}
