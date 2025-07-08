package OOPS;



// static keyword  is used to share the same variable or method of a given class to all the object
// we can declare static to
// 1 properties
// 2 function
// 3 Blocks
// 4 nested class
public class oops24 {
    public static void main(String args[]){
    Student s1=new Student();
    s1.schoolname ="kaziranga university";
    s1.name="chandan";
    s1.roll=53;
    System.out.println(s1.schoolname);
    System.out.println(s1.name);
    System.out.println(s1.roll);

    Student s2=new Student();
    s2.name="kundan";
    s2.roll=56;
    System.out.println(s2.schoolname);
    System.out.println(s2.name);
    System.out.println(s2.roll);

    Student s3 =new Student();
    s3.schoolname="Bethesda hr. sec, school";
    s3.name="pratap";
    s3.roll=67;
    System.out.println(s3.schoolname);
    System.out.println(s3.name);
    System.out.println(s3.roll);
       Student s4=new Student();
    //s4.schoolname ="kaziranga university";
    s4.name="chandan";
    s4.roll=53;
    System.out.println(s4.schoolname);
    System.out.println(s4.name);
    System.out.println(s4.roll);

    
}
}
class Student{
    String name;
    int roll;

    static String schoolname;

    void setschoolname(String schoolname){
        this.schoolname=schoolname;
    }
    String getschoolname(){
        return this.schoolname;
    }


}

