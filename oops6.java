package OOPS;
// to access privATE VARIABLE
// getter & setter used to access and update the private variable of a class
// this means current object 

public class oops6 {
    public static void main(String args[]){
        Bank c1=new Bank();
        System.out.println(c1.name_holder);
        c1.setaccount_no(45678);
        System.out.println(c1.getaccount_no());
    }
    
}
class Bank{
    public String name_holder="chandan";
    private int account_no = 123456;

    // get to return value
    int getaccount_no(){
        return this.account_no;
    }
    // set is used to modify the value

    void setaccount_no(int account_no){
        this.account_no=account_no;
    }
    
}
