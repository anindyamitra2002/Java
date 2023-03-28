class TestStaticNonstaticException{
    int a = 19;
    int b = 22;
    static void go(){
        try{
//            int res = a * b;
//            System.out.println(res);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class StaticNonStatic {
    public static void main(String[] args) {
        TestStaticNonstaticException ts = new TestStaticNonstaticException();
        ts.go();
    }
}
