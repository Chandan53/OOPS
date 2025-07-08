package OOPS;

public class oops16 {
    // multiple function with the same name with different parameters is called method overloading
    public static void main(String args[]){
        Function_overloading f1=new Function_overloading();
        System.out.println(f1.sum(2,3));
        System.out.println(f1.sum((float)2.3 , (float)4.5));
        System.out.println(f1.sum("chan","dan"));
        System.out.println(f1.sum(3,4,5));

    }
    
    
}
class Function_overloading{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    String sum(String a,String b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
