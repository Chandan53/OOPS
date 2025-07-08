package OOPS;

public class oops20 {
    public static void main(String args[]){
        // we cannot create a object of a abstract class
        Horse h1=new Horse();
        h1.eat();
        h1.walk();

        Chicken c1=new Chicken();
        c1.eat();
        h1.walk();
    }
    
}
abstract class Animal{
   void eat(){ // non abstract method
    System.out.println("animal can eat");
   }
   abstract void walk(); // abstract method --> when we defina a abstract method we forced to take that method in sub class
   // or else it will give error

}
class Horse extends Animal{
    // we are forced to take walk method or else it will give error
    void walk(){
        System.out.println(" horse walk in 4 legs");
    }
}
class Chicken extends Animal{
    // we are forced to take walk method or else it will give error
    void walk(){
        System.out.println(" chicken walk at 2 legs");

    }
}


