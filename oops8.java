package OOPS;

public class oops8 {
    public static void main(String args[]){
        Constructor sc=new Constructor();

    }
    
}
class Constructor{
    String name;

    // constructor have the same name as class 
    // constructor does not have a return type
    // constructor is called only one time  at the object creation
    // memory allocation happens when a constructor is called

    Constructor(){
        System.out.println("a constructor is called auto-matically when a object is created");
    }
}
