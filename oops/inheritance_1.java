
class student{
    int roll,marks;
    String name;
    void input(){
        System.out.println("enter the roll marks name :");
    }
}


class venki extends student{
    void disp(){
        roll=78;
        name="venki";
        marks=587;

    
    System.out.println("roll NO: "+ roll);
    System.out.println("name :"+ name);
    System.out.println("marks "+ marks);

    }

}

public class inheritance_1 {
    public static void main(String args[]){
        venki v1=new venki();
        v1.input();
        v1.disp();
    }
}
