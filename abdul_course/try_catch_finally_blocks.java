import java.security.spec.ECGenParameterSpec;

public class try_catch_finally_blocks {
    public static void main(String args[]){
        int arr[]={10,20,30,40,0};

        try{
            int c=arr[1]/arr[2];
            System.out.println(c);
            System.out.println(arr[10]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }

        finally{
            System.out.println("finally block");
        }

        System.out.println();
    }
}
