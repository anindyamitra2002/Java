class Exp{
    int arr [] = {1,4,2,6,8,3};
    void go(){
        System.out.println("Printing array elements");
        try{
//            System.out.println(arr[6]);
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (Exception e){
            System.out.print("The program is stopped due to: ");
            System.out.println(e);
        }
    }
}
public class ArrayBoundException {
    public static void main(String[] args) {
        Exp exp = new Exp();
        exp.go();
    }
}
