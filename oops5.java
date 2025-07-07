package OOPS;

public class oops5 {
    // using private access modifier & public modifier
    public static void main(String atgs[]){
        Bank c1=new Bank();
       // System.out.println(c1.password); // error // we cannot access private access mofifier out the class
        // but we can change the password outside the class as with in the class we have taken public to setpassword function
        c1.setpassword("hhheikkjhj245");
    }
    
}

class Bank{
    private String password="chandankumar5677";
    // private access modifier we can access only with in  the class
    public void setpassword(String newpassword){
    password=newpassword;
    }
}
