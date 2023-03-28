class FinalVar{
    final int x = 10;
    void go(){
        try{
//            x = 12;
            System.out.println(x);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class ChangeFinalVar {
    public static void main(String[] args) {
        FinalVar fv = new FinalVar();
        fv.go();
    }
}
