import javax.swing.text.Position;

public class passing_values {


    //passing arguments by value...................
    public static void main(String[] args){
        int x=1;
        increment(x);
        System.out.println("inside main method:"+x);
    }
    public static void increment(int x){
        x++;
        System.out.println("inside increment:"+x);
    }
    


}
