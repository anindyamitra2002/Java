class GoIterate{
    void startPrint(){
        for (int i = 1; i < 100; i++){
        
            if(i % 10 != 0){
                System.out.println(i);
            }
        }
    }
}
class PrintSpecialNumber{
    public static void main(String args[]){
        GoIterate it = new GoIterate();
        it.startPrint();
    }
}