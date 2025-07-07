package OOPS;
// types of constructor
// non-parameterized constructor
// parameterized constructor

public class oops9 {

    public static void main(String args[]){

        C c1 = new C();
        C c2=new C("chandan");
        System.out.println(c2.name);
        C c3=new C(554);
        System.out.println(c3.roll);
    }

    
}
class C{
    String name;
    int roll;
// non- parameterized constructor
    C(){
        System.out.println("Kaziranga University");
    }

    // parameterized constructor 
    C(String name){
        this.name=name;
    }

    C( int roll){
        this.roll=roll;
    }

}
