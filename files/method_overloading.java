import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class method_overloading {
   
   //method overloading.....................
   //below the methods are same with name sum()....but parameters are different.......
    public static void main(String[] args){
        sum(5,6);
        sum(6,8,3);
        
        hi();
        System.out.println(hi(" kolleti"));

        System.out.println("name:"+ getname()+"\t age:"+ getage());
        
    }



    //direct method overloading...
    private static void sum(int x,int y){
        System.out.println(x+y);
    }
    private static void sum(int x,int y,int z){
        System.out.println(x+y+z);
    }




    //overloading method with different return types..
    private static void hi(){
        System.out.println("hello");
    }
    private static String hi(String name){
        return "hello "+name;

    }



    //print user name and age by using methods.......................
    
    public static String getname() {
        System.out.print("enter your name:");
        Scanner input=new Scanner(System.in);
        return input.nextLine();

    }
    public static int getage() {
        System.out.print("enter your age:");
        Scanner input=new Scanner(System.in);
        return input.nextInt();

    }
        
    
    



    
}
