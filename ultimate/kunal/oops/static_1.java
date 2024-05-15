public class static_1 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        System.out.println(s1.count+"\n"+s2.count+"\n"+s3.count);
    }
}

class Student{
    static int count;
    Student(){
        Student.count+=1;
    }
}