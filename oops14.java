package OOPS;
// hierachial inheritance --> having single base class and multiple derived classes
public class oops14 {
    public static void main(String args[]){
        Men m1=new Men();
        m1.color="black";
        System.out.println(m1.color);
        m1.eat();
        m1.difference();
        m1.name="chandan";
        System.out.println(m1.name);
        System.out.println();

        // 2 object
        Women w1=new Women();
        w1.color="white";
        System.out.println(w1.color);
        w1.eat();
        w1.name="chandani";
        System.out.println(w1.name);
        w1.difference();
    }
    
}
class Human{
    String color;
    void eat(){
        System.out.println(" eat food");
    }
}

class Men extends Human{
    String name;
    void difference(){
        System.out.println("men is strong than women as compare ");
    }
}
class Women extends Human{
    String name;
    void difference(){
        System.out.println(" women are weak than men as compare to strength");
    }
}
