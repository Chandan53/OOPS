package OOPS;
// Second piller of OOPs
// Inheritance --> Inheritance is when properties & function of base class are passes on to a derived class
public class oops11 {
    public static void main(String args[]){
        Fish f1=new Fish();
        f1.eat();
        f1.swim();
        f1.breath();
        f1.fins=4;
        f1.color="Silver 🐠";
        System.out.println(f1.fins);
        System.out.println(f1.color);

    }
    
}
class Animal{
    String color;

    void eat(){
        System.out.println("can eats");
    }
    void breath(){
        System.out.println(" can breath");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println(" can swims");
    }
}
