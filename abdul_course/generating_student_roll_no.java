
import java.util.Date;

class student{
    private String rollNo;
    private static int count=1;
    private String assignRollNo(){
        Date d=new Date();
        String rno="UNIV-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    student(){
        rollNo=assignRollNo();
    }
    public String getRollNo(){
        return rollNo;
    }
}


public class generating_student_roll_no {
    public static void main(String args[]){
        student s1=new student();
        student s2=new student();
        student s3=new student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());




    }
}


