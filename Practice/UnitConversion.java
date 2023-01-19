import java.util.Scanner;

class StartConversion{
    Scanner sc = new Scanner(System.in);
    void go(){
        System.out.println("Press 1- Currecy conversion; Press 2- Temperature Conversion; Press 3- Distance conversion;");
        System.out.print("Enter your choise:  ");
        int ch = sc.nextInt();
        if(ch == 1){
            CurrecyConversion cc = new CurrecyConversion();
            cc.chooseCurrencyUnit();

        }
    }
}
class CurrecyConversion{
    Scanner sc = new Scanner(System.in);

    void chooseCurrencyUnit(){
        while(true){
            System.out.println("\nPress 0- Back; Press 1- Rupee-Dollar; Press 2- Euro-Rupee; Press 3- Dollar-Euro; Press 4- Pound-Rupee; Press 5- Pound-Dollar; Press 6- Pound-Euro");
            int ch = sc.nextInt();
            if(ch == 0){
                break;
            }
            else if(ch == 1){
                this.rupeeDollar();
            }
            else if(ch == 2){
                this.euroRupee();
            }
            else if(ch == 3){
                this.euroDollar();
            }
            else if(ch == 4){
                this.poundRupee();
            }
            else if(ch == 5){
                this.poundDollar();
            }
            else if(ch == 6){
                this.poundEuro();
            }
        }
    }
    
    void rupeeDollar(){
        float rs, dl;
        System.out.println("Select te Unit: 1 for Rupees; 2 for Dollars");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.print("Rupee -> ");
            rs = sc.nextInt();
            System.out.println("Dollar -> "+ (rs*0.012));
        }

        else if(ch == 2){
            System.out.print("Dollar -> ");
            dl = sc.nextInt();
            System.out.println("Rupee -> "+ (dl*81.32));
        }
        
    }

    void euroRupee(){
        float rs, eu;
        System.out.println("Select te Unit: 1 for Rupees; 2 for Euro");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.print("Rupee -> ");
            rs = sc.nextInt();
            System.out.println("Euro -> "+ (rs*0.011));
        }

        else if(ch == 2){
            System.out.print("Euro -> ");
            eu = sc.nextInt();
            System.out.println("Rupee -> "+ (eu*88.24));
        }
        
    }

    void euroDollar(){
        float dl, eu;
        System.out.println("Select te Unit: 1 for Dollar; 2 for Euro");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.print("Dollar -> ");
            dl = sc.nextInt();
            System.out.println("Euro -> "+ (dl*0.92));
        }

        else if(ch == 2){
            System.out.print("Euro -> ");
            eu = sc.nextInt();
            System.out.println("Dollar -> "+ (eu*1.09));
        }
        
    }

    void poundRupee(){
        float rs, pd;
        System.out.println("Select te Unit: 1 for Rupee; 2 for Pound");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.print("Rupee -> ");
            rs = sc.nextInt();
            System.out.println("Pound -> "+ (rs*0.010));
        }

        else if(ch == 2){
            System.out.print("Pound -> ");
            pd = sc.nextInt();
            System.out.println("Rupee -> "+ (pd*100.35));
        }
        
    }
    void poundDollar(){
        float dl, pd;
        System.out.println("Select te Unit: 1 for Dollar; 2 for Pound");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.print("Dollar -> ");
            dl = sc.nextInt();
            System.out.println("Pound -> "+ (dl*0.81));
        }

        else if(ch == 2){
            System.out.print("Pound -> ");
            pd = sc.nextInt();
            System.out.println("Dollar -> "+ (pd*1.23));
        }
        
    }
    void poundEuro(){
        float eu, pd;
        System.out.println("Select te Unit: 1 for Euro; 2 for Pound");
        int ch = sc.nextInt();
        if(ch == 1){
            System.out.print("Euro -> ");
            eu = sc.nextInt();
            System.out.println("Pound -> "+ (eu*0.88));
        }

        else if(ch == 2){
            System.out.print("Pound -> ");
            pd = sc.nextInt();
            System.out.println("Euro -> "+ (pd*1.14));
        }
        
    }
}
class TemperatureConversion{
    Scanner sc = new Scanner(System.in);
    void chooseTemperatureUnit(){
        
    }
}
public class UnitConversion {
    public static void main(String[] args) {
        StartConversion sc = new StartConversion();
        sc.go();
    }
}
