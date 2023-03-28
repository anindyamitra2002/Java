class ArithmaticExp{
    void go(){
        int result;
        int x = 2;
        int y = 0;
        try {
            result = x / y;
        }
        catch(Exception e){
            System.out.print("The program is stopped due to: ");
            System.out.println(e);
        }
        System.out.println("hi");
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        ArithmaticExp ar = new ArithmaticExp();
        ar.go();
    }
}
