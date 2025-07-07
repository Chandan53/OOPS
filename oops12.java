package OOPS;
// types of inheritance
// single level inheritance
// multi level inheritance
// hierachial inheritance
// hybrid inheritance
public class oops12 {
    public static void main(String args[]){
        Men m1= new Men();
        m1.name="chandan";
        System.out.println(m1.name);
        m1.structure();
        m1.mentalhealth();
        m1.anus();
    }
    
}
class Human{
    String name;

    void structure(){
        System.out.println(" having two legs");
        System.out.println("having two hand");
        System.out.println("having two eyes");
        System.out.println("having two ears");
        System.out.println("having two kidney");
    }
}
class Men extends Human{
    void mentalhealth(){
        System.out.println("strong");
    }
    void anus(){
        System.out.println(" having anus with two eggs 😀 ");
    }
}
