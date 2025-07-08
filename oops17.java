package OOPS;

public class oops17 {
    public static void main(String args[]){
        Lion l1=new Lion();
        l1.eat();

        Animal a1=new Animal();
        a1.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.println("eat any_things");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println(" eat only meat");
    }
}
