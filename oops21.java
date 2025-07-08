package OOPS;
public class oops21 {
    public static void main(String args[]){
        Men m1=new Men();
        m1.structure();
        m1.strong();

        Women w1=new Women();
        w1.structure();
        w1.strong();
    }
    
}
abstract class Human{
    void structure(){
        System.out.println( "human have 2 legs and 2 hands");
    }
    abstract void strong(); // this abstract method will not depend on Human class it will depend of Child Class
    
}
class Men extends Human{
    void strong(){
        System.out.println( "Men are stronger than women");
    }
}
class Women extends Human{
    void strong(){
        System.out.println("women are weak than Men");
    }

  
}
