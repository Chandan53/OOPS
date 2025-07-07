package OOPS;

public class practice {
    public static void main(String args[]){
        Puppy p1=new Puppy("brown","Laborder");
        p1.display();
        p1.sound();
    }
    
}
class Animal{
    String color;
    void sound(){
        System.out.println( "Animal make sound");
    }

}
class Dog extends Animal{
    String breed;
    void sound(){
        System.out.println("Dog bark");
    }
}
class Puppy extends Dog{

    Puppy(String color,String breed){
        this.color=color;
        this .breed =breed;
    }
    void display(){
        System.out.println("color " + this.color);
        System.out.println("breed " + this.breed);
    }
}