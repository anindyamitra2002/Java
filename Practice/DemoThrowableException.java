class Throwable{
    static void display()throws ArrayIndexOutOfBoundsException {
//        System.out.println(2/0);

        throw new ArithmeticException("Arithmatic Exception Detected");
//        System.out.println("hello");
    }
}

public class DemoThrowableException {
    public static void main(String[] args) {
        Throwable th = new Throwable();
        try{
        th.display();
        }
        catch (Exception e){
            System.out.println(e);
//            throw e;
            try{
                System.out.println(2/0);
            }
            catch(Exception er){
                System.out.println(er);
            }
        }
    }
}
