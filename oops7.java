package OOPS;
// first piller of ooops 
// encpsulation --> wrapping up of data & method under a single unit it also implement data hiding

public class oops7 {
    public static void main (String args[]){
        Encapsulation e1=new Encapsulation();
        e1.setname("chandan");
        System.out.println(e1.getname());
    }

    
}
class Encapsulation{
    // data
    private String name;
// method
    void setname(String name){
        this.name=name;
    }
// method
    String getname(){
        return this.name;
    }
}
