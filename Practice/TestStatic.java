class Check{
    static int x = 5;
    static float y = x;
    static float z = 0;
     void compute(){
        z = x*y;
        System.out.println(z);
    }
}
public class TestStatic {
    public static void main(String[] args) {
        Check c = new Check();
        c.compute();
    }
}
