class FindStrPlallindrom{
    String mystr = "BCDCB";
    boolean pallindrome = false;
    int k = mystr.length()-1;
    // String [] arr = new String [];
    
    void CheckString(){
     for(int index = 0; index < mystr.length()/2; index++){
        if(mystr.charAt(index)==(mystr.charAt(k))){
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
class StrPallindrome {
    public static void main(String[] zoo) {
        FindStrPlallindrom fsp = new FindStrPlallindrom();
        fsp.CheckString();
        fsp.showResult();
    }
}
