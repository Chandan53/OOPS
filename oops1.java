package OOPS;

public class oops1 {
    public static void main(String args[]){
        // creating a object
        Pen p1=new Pen();
        // we use Dot operator to call the function from the class or attributes of the class
        p1.color="blue";
        p1.tip=5;
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.setcolor("red");
        p1.settip(4);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
    
}
// class is blue print of the object
// object is the instence of the class
class Pen{
    // attributes
    String color;
    int tip;

    // function
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtip){
        tip=newtip;
    }
}

class Student{
    // attributes 
    String name;
    int age;
    int percentage;

    // function or method
    void setname(String newname){
        name=newname;
    }
    void setage(int newage){
        age = newage;
    }
    void calculatepercebntage(int phy ,int chem,int math){
        percentage=(phy+chem+math) /3;

    }

}
