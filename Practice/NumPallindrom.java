class FindNumPlallindrom{
    int [] num = {1,2,3,3,2,1};
    boolean pallindrome = false;
    int k = num.length - 1;

    void CheckString(){
        for(int index = 0; index < num.length/2; index++){
        if(num[index] ==(num[k])){
            pallindrome = true;
        }
        else{
            pallindrome = false;
        }
         k--;
        }
      
    }
    
    void showResult(){
        if(pallindrome){
            System.out.println("Yes, the given String is a pallindromic sequence");
        }
        else{
            System.out.println("No, the given String is not a pallindromic sequence");
        }
    }
}

class NumPallindrom {
    public static void main(String[] args) {
        FindNumPlallindrom fip = new FindNumPlallindrom();
        fip.CheckString();
        fip.showResult();
    }
}
