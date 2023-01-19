// Assume the first day of a month is a sunday. Accept an input between 1 and 31 that will display the corresponding day of the week
import java.util.*;
class TestLoop{
    int day;
    Scanner sc = new Scanner(System.in);
    void checkDay(){
        day = sc.nextInt();
        if(day < 1 || day > 31){
            System.out.println("invalid input!");
        }
        else{
            if(day % 7 == 1){
                System.out.println("The Day is: Sunday");
            }
            else if(day % 7 == 2){
                System.out.println("The Day is: Monday");
            }
            else if(day % 7 == 3){
                System.out.println("The Day is: Tuesday");
            }
            else if(day % 7 == 4){
                System.out.println("The Day is: Wednesday");
            }
            else if(day % 7 == 5){
                System.out.println("The Day is: Thurday");
            }
            else if(day % 7 == 6){
                System.out.println("The Day is: Friday");
            }
            else if(day % 7 == 0){
                System.out.println("The Day is: Saturday");
            }
        }
    }
}
class GetDay{
    public static void main(String args[]){
        TestLoop tl = new TestLoop();
        tl.checkDay();
    }
}