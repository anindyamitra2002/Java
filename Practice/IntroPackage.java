import java.util.Scanner;
class Test{
    int x;
    double y;
    char z = 'a';

    void test1() {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        x = sc.nextInt();   // Input a Integer variable
        System.out.println("Enter a float number");
        y = sc.nextDouble();   // Input a Float variable
        System.out.println("Enter a Character: ");
        z = sc.next().charAt(0);   // Input a Char variable
        String str = sc.next();
        System.out.println(str);
        
    }
}
public class IntroPackage {
   public static void main(String[] args) {
    Test t = new Test();
    t.test1();
   } 
}
