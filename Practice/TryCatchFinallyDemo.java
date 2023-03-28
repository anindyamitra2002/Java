import java.sql.SQLOutput;
import java.util.Scanner;

class TCF{
    Scanner sc = new Scanner(System.in);
    void go(){
        int arr [] = new int [5];
        try{
            for (int i = 0; i < 6; i++) {
                arr[i] = sc.nextInt();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Your program is stopped");
        }
    }
}
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        TCF tcf = new TCF();
        tcf.go();
    }
}
