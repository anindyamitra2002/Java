import java.util.Scanner;
class TestVowel{
    Scanner sc = new Scanner(System.in);
    String str;
    // int [] arr = new int [2];
    int p = 0;
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
                a++;
            }
            else if(str.charAt(index) == 'e'){
                e++;
            }
            else if(str.charAt(index) == 'i'){
                i++;
            }
            else if(str.charAt(index) == 'o'){
                o++;
            }
            else if(str.charAt(index) == 'u'){
                u++;
            }
        }
    }

    void printResult(){
        System.out.println("The total nos of 'a' is: " + a);
        System.out.println("The total nos of 'e' is: " + e);
        System.out.println("The total nos of 'i' is: " + i);
        System.out.println("The total nos of 'o' is: " + o);
        System.out.println("The total nos of 'u' is: " + u);
    }
}
public class VowelCounter {
    public static void main(String[] args) {
        TestVowel tv = new TestVowel();
        tv.checkVowel();
        tv.printResult();
    }
}
