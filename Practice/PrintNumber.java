// print 1 to 1000 alternativly using 2 class structure;
class Iterate{
    void startPrint(){
        for (int i = 0; i < 50; i++){
            System.out.println(2*i+1);
        }
    }
}

class PrintNumber{
    public static void main(String args[]){
        Iterate it = new Iterate();
        it.startPrint();
    }
}
