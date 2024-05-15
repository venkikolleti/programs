package generics_exceptions;
import java.util.Arrays;

public class object_comparison {
    public static void main(String[] args) {
        Student s1=new Student(10, 20.5f);
        Student s2=new Student(11, 30.5f);
        Student s3=new Student(2, 30.5f);
        Student s4=new Student(17, 30.5f);


        if(s1.compareTo(s2)<0){
            System.out.println("s2 is greater");
        }
        else if(s1.compareTo(s2)==0){
            System.out.println("s1 and s2 are equal");
        }
        else{
            System.out.println("s1 is greater");
        }




        Student[] list={s1,s2,s3,s4};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }    
}

class Student implements Comparable<Student>{
    int roll;
    float marks;
    public Student(int roll,float marks){
        this.roll=roll;
        this.marks=marks;
    }
    @Override
    public int compareTo(Student t) {
        int diff=(int)(this.roll-t.roll);
        return diff;
    }
    @Override
    public String toString() {
        return  roll + " ";
    }
    
}
