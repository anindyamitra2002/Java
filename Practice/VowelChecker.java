import java.util.Scanner;
class ShowVowel{
    Scanner sc = new Scanner(System.in);
    String str;
    int a = 0;
    int e = 0;
    int i = 0;
    int o = 0;
    int u = 0;

    void checkVowel(){
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        str = str.toLowerCase();
        for (int index = 0; index< str.length(); index++){
            if(str.charAt(index) == 'a'){
                if(a == 0){
                    System.out.println("A ");
                    a++;
                }
            }
            else if(str.charAt(index) == 'e'){
                if(e == 0){
                    System.out.println("E ");
                    e++;
                }
            }
            else if(str.charAt(index) == 'i'){
                if(i == 0){
                    System.out.println("I ");
                    i++;
                }
            }
            else if(str.charAt(index) == 'o'){
                if(o == 0){
                    System.out.println("O ");
                    o++;
                }
            }
            else if(str.charAt(index) == 'u'){
                if(u == 0){
                    System.out.println("U ");
                    u++;
                }
            }
        }
    }

}
public class VowelChecker {
    public static void main(String[] args) {
        ShowVowel sv = new ShowVowel();
        sv.checkVowel();
    }
}

