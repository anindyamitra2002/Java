class TestLogic{

    void test100(){
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                System.exit(0);
            }
            System.out.println(i);
            
        }
    }
    void printCall(){
        System.out.println("out");
    }

    
}
class TestStart{
    public static void main(String args[]){
        TestLogic t1 = new TestLogic(); // object declaration statement
        t1.test100(); // funtion call using object t1
        t1.printCall();
    }
}