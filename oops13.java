package OOPS;

public class oops13 {
    public static void main(String args[]){
        Women w1=new Women();
        w1.name="chandan";
        System.out.println(w1.name);
        w1.color="black";
        System.out.println(w1.color);
        w1.eat();
        w1.structure();
        w1.unique();

    }
    
}
class Human{
    String color;
    void eat(){
        System.out.println(" eats food");
    }

}
class Men extends Human{
    String name;
    void structure(){
        System.out.println(" two hands");
    }
}
class Women extends Men{
    void unique(){
        System.out.println(" little different than men");
    }
}
