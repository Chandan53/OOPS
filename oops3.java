package OOPS;

public class oops3 {
    public static void main(String args[]){
        Bank c1=new Bank();
        System.out.println(c1.account_no);
        System.out.println(c1.bank_name);
        c1.set(34567);
        System.out.println(c1.account_no);
        c1.setname("panjub");
        System.out.println(c1.bank_name);

    }
    
}
class Bank{
    int account_no=123456;
    String bank_name="sbi";

    // function 
    void set(int newaccount_no){
        account_no=newaccount_no;
    }
    void setname(String newbank_name){
        bank_name=newbank_name;
    }
}
