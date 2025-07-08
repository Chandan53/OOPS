package OOPS;

public class oops18 {
    public static void main(String args[]){
        Animal a1=new Animal(); // error
        // property one of abstract --> cannot create an object of abstract class
    }
    
}
abstract class Animal{
    void eat(){
        System.out.println( " animal can eat");
    }
}