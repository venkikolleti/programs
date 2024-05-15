import java.util.StringTokenizer;

class age_exception {
    public static void main(String args[]){
        int age=45;
        try{
            String name="rhfk";
            int x=230;
            int y=x/0;
            System.out.println(y);
            if(age>18){
                System.out.println("eligible for vote");
            }
            else{
                System.out.println("not eligible for vote");
            }
        }catch(ArithmeticException ae){
            System.out.println("this is: "+ae);
        }
    }    
}









