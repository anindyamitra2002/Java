class SameExp{
    int arr [] = {1,4,2,6,8,3};
    void go(){
        int result;
        int x = 2;
        int y = 0;
        try {
            System.out.println(arr[6]);
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.print("The program is stopped due to: ");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("The program is stopped due to this exp: ");
            System.out.println(e);
        }
    }
}
public class SameExpDiffCatch {
    public static void main(String[] args) {
        SameExp se = new SameExp();
        se.go();
    }
}
