package OOPS;

public class oops25 {
    // Super keyword
    /* Super keyword is used to refer immediate parent class object.
     * 1. to access parent properties.
     * 2. to access parent functions
     * 3. to access parent Constructor
     */
    public static void main(String args[]){
        Horse h=new Horse();
    }
    
}
class Animal{
    
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super(); // super keyword is used
        System.out.println("Horse constructor is called");
    }
}
