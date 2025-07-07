package OOPS;



public class oops2 {
    public static void main(String args[]){
        // creating a Pen object
        Pen p1=new Pen();
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
    
}
class Pen{
    String color="blue";
    int tip =5;

    // method
    void setcolor(String newcolor){
        color=newcolor;
    }
     void settip(int newtip){
        tip=newtip;
     }
}
