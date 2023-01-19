class FindAcrostic{
    // char arr [][] = new char [5][5];
    boolean pal;
    boolean acro;
    
    char arr [][] = {{'R','O','T','A','S'},
                     {'O','P','E','R','A'},
                     {'T','E','N','E','T'},
                     {'A','R','E','P','O'},
                     {'S','A','T','O','R'}};
                     
    void checkRowPallindrome(){
        int k= arr.length-1;
        for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length; i++){
                    if(arr[j][i] == arr[j][k]){
                    pal = true;
                }
                else{
                    pal = false;
                    break;
                }
            }
        

            for(int i = 0; i < arr.length; i++){

                if(!pal){
                    if(arr[j][i] == arr[arr.length-j-1][k]){
                        acro = true;
                    }
                    else{
                        acro = false;
                    }
                }
            }
            k--;
        }
        
        System.out.println("row: "+acro);
    }

    void checkColPallindrome(){
        int k = arr.length-1;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                    if(arr[j][i] == arr[j][k]){
                    pal = true;
                }
                else{
                    pal = false;
                    break;
                }
            }
        

            for(int j = 0; j < arr.length; j++){

                if(!pal){
                    if(arr[j][i] == arr[arr.length-i-1][k]){
                        acro = true;
                    }
                    else{
                        acro = false;
                    }
                }
            }
            k--;
        }
        
        System.out.println("col: " +acro);
    }

}
public class Acrostic {
    public static void main(String[] args) {
        FindAcrostic fa = new FindAcrostic();
        fa.checkRowPallindrome();
        fa.checkColPallindrome();
    }
}
