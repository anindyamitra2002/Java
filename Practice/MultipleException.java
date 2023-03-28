class MultExp{
    int arr [] = {1,4,2,6,8,3};
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
        try{
            for (int i = 0; i <= arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        catch (Exception e){
            System.out.print("The program is stopped due to: ");
            System.out.println(e);
        }
    }
}
public class MultipleException {
    public static void main(String[] args) {
        MultExp mex = new MultExp();
        mex.go();
    }
}
