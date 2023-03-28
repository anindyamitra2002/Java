class Employee{
    void play(){
        System.out.println("play");
    }
}
class Manager extends Employee{
    void go(){
        System.out.println("go");
    }
}
public class ObjectTypeCastingIntro {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Employee e1 = m1; // Implicit type-caste

        Employee e2 = new Employee();
        Manager m2 = (Manager) e2; // explicit type-caste

        }
}
