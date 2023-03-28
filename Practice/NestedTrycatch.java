class NestedExp{
    int arr [] = {1,4,2,6,8,3};
    void go(){
        try{
            try{
                System.out.println(5/0);
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println(arr[6]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class NestedTrycatch {
    public static void main(String[] args) {
        NestedExp ntc = new NestedExp();
        ntc.go();
    }
}
