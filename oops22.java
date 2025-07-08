package OOPS;
// Q which constructor will print first
public class oops22 {
    public static void main(String args[]){
        Capricon c1=new Capricon();
        // Hierachial order
        // Animal --> Horse --> Capricon
    }
    
}
abstract class Animal{
    Animal(){
        System.out.println("animal Constructor");
    }
}
class Horse extends Animal {
    Horse(){
        System.out.println(" Horse constructor");
    }
}
class Capricon extends Horse{
    Capricon(){
        System.out.println("Capricon constructor");
    }
}
