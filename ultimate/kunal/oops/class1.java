import java.util.Arrays;

public class class1 {


    public static void main(String[] args) {
        Student[] stu=new Student[5];

        System.out.println(Arrays.toString(stu));// giving default reference value null

        //new keyword allocate memory dynamically at runtime and return reference to the reference variable


        Student s=new Student();
        System.out.println(s.rollno);
        System.out.println(s.name);
        System.out.println(s.marks);

        Student s1=new Student(50,"venki",50.6f);

        System.out.println("using this :"+s1.rollno);
        System.out.println("if we cant use this it gives default values it does not; refers to object variable: "+s1.marks);

    


        Student one=new Student();
        Student two =one;
        System.out.println("\n"+two.name);
        one.name="venkaiah kolleti";
        System.out.println(two.name);

    }
}

class Student{
        int rollno;
        String name;
        float marks;

        Student(){
            rollno=12;
            name="kolleti";
            marks=80.5f;
        }

        Student(int rollno, String name ,float marks){
            this.rollno=rollno;
            this.name=name;
            marks=marks;        
        }
}
