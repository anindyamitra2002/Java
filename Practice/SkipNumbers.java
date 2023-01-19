class Jump{
    void jusmpIt(){
        for(int i = 0; i<= 10;i++){
            if(i == 4 || i == 7){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}

class SkipNumbers{
    public static void main(String args[]){
        Jump jmp = new Jump();
        jmp.jusmpIt();
    }

}