import java.util.Scanner;

class Login{
    private String name;
    private String password;
    Scanner sc = new Scanner(System.in);

    class ValidateCredential{
        public void Validate(){
            name = sc.next();
            password = sc.next();
            System.out.println("User ID: " + name);
            System.out.println("Password: " + password);
        }
    }

}
public class RegularInnerClassDemo {
    public static void main(String[] args) {
     Login log = new Login();
     Login.ValidateCredential vc = log.new ValidateCredential();
     vc.Validate();
    }
}
