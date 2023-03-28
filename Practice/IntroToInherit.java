class Parent
{
    void show(){
    System.out.println("Hi i am Parent of all");
    }
}
class Child1 extends Parent{
    void show(){
    super.show();
     System.out.println("Hi i am child1");
    }
}

class Child2 extends Parent{
   void show(){
    
    System.out.println("Hi i am child2");
   }
}
class IntroToInherit {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.show();
    }
}