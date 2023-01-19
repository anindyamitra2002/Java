import java.util.*;
class TestLoop{
        Scanner sc = new Scanner(System.in);
    void checkDay(int tday, int gday, int sday){
        if(gday < 1 || gday > sday){
            System.out.println("invalid input!");
        }
        else{
            int pday = gday + tday;
            if(pday % 7 == 1){
                System.out.println("The Day is: Sunday");
            }
            else if(pday % 7 == 2){
                System.out.println("The Day is: Monday");
            }
            else if(pday % 7 == 3){
                System.out.println("The Day is: Tuesday");
            }
            else if(pday % 7 == 4){
                System.out.println("The Day is: Wednesday");
            }
            else if(pday % 7 == 5){
                System.out.println("The Day is: Thurday");
            }
            else if(pday % 7 == 6){
                System.out.println("The Day is: Friday");
            }
            else if(pday % 7 == 0){
                System.out.println("The Day is: Saturday");
            }
        }
    }
    
    void checkMonth(){
        int m1 = 31;
        int m2 = 28;
        int m3 = 31;
        int m4 = 30;
        int m5 = 31;
        int m6 = 30;
        int m7 = 31;
        int m8 = 31;
        int m9 = 30;
        int m10 = 31;
        int m11 = 30;

        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        System.out.println("Enter the day: ");
        int day = sc.nextInt();
        
        if(month < 1 || month > 12){
            System.out.println("invalid Month!");
        }
        else{
            if(month== 1){
                System.out.println("The Month is January.");
                this.checkDay(0, day, 31);
            }
            else if(month == 2){
                System.out.println("The Month is February.");
                this.checkDay(m1, day, 28);
            }
            else if(month == 3){
                System.out.println("The Month is March.");
                this.checkDay(m1+m2, day, 31);
            }
            else if(month == 4){
                System.out.println("The Month is April.");
                this.checkDay(m1+m2+m3, day, 30);
            }
            else if(month == 5){
                System.out.println("The Month is May.");
                this.checkDay(m1+m2+m3+m4, day, 31);
            }
            else if(month == 6){
                System.out.println("The Month is June.");
                this.checkDay(m1+m2+m3+m4+m5, day, 30);
            }
            else if(month == 7){
                System.out.println("The Month is July.");
                this.checkDay(m1+m2+m3+m4+m5+m6, day, 31);
            }
            else if(month == 8){
                System.out.println("The Month is August.");
                this.checkDay(m1+m2+m3+m4+m5+m6+m7, day, 31);
            }
            else if(month == 9){
                System.out.println("The Month is Septembar.");
                this.checkDay(m1+m2+m3+m4+m5+m6+m7+m8, day, 30);
            }
            else if(month == 10){
                System.out.println("The Month is October.");
                this.checkDay(m1+m2+m3+m4+m5+m6+m7+m8+m9, day, 31);
            }
            else if(month == 11){
                System.out.println("The Month is November.");
                this.checkDay(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10, day, 30);
            }
            if(month == 12){
                System.out.println("The Month is December.");
                this.checkDay(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11, day, 31);
            }
        }
    }
    
}

class GetDM{
    public static void main(String args[]){
        TestLoop tl = new TestLoop();
        tl.checkMonth();
    }
}