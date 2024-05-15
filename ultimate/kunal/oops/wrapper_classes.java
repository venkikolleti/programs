import javax.management.remote.SubjectDelegationPermission;

public class wrapper_classes {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);//here elements not swapped...

        //wrapper classes
        Integer c=10;//wrapper class
        Integer d=20;

        swap(c,d);
        System.out.println("\n"+c+" "+d);// still its not swap beacause wrapper classes are final



        System.out.println();

        final Student s=new Student("venki");//whenever object is final it allows to change the properties
        s.name="rajuii";
        
        //s=new Student("raviii");      // but it not allows to reassign it....
        System.out.println(s.name);

    }
    static void swap(int a,int b){//call by values
        int temp=a;
        a=b;
        b=temp;
    }

    static void swap_wrapper(Integer c,Integer d){//wrapper classes used for call by references
        Integer temp=c;
        c=d;
        d=temp;
    }
}



class Student{
    int num=10;
    String name;
    Student(String name){
        this.name=name;
    }
}
