interface Square {
    float side = 3.4f;
    void computePerimeter(); 
}

class Rectangle{
    void greet(){
        System.out.println("Hi");
    } 
}

class Calculator extends Rectangle implements Square{
    public void computePerimeter(){ // public can only overide the public method
        System.out.println("Perimeter: " + (4*side));
    }
   
}

public class MultipleInterface {
    public static void main(String[] args) {
         Calculator calc = new Calculator();
        calc.computePerimeter();
        calc.greet();
    }
}
