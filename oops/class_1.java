import java.util.Scanner;

class student{
    int i;
    String name;
    public student(){
        System.out.print("enter yout clg Id: ");
        Scanner input=new Scanner(System.in);
        i=input.nextInt();
    }
    public student(String n){
        i=8;
        name=n;
    }
}

public class class_1 {
    public static void main(String args[]){
        System.out.println("kolleti");
        student s1=new student();
        student s1=new student("ven");
        
        System.out.println("your id is "+s1.i);
        student s2=new student("kolleti");
        System.out.println("your i value "+s2.i);
        
    }
}
