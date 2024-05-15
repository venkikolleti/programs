public class nested_try_catch_blocks {
    public static void main(String args[]){

        int arr[]={1,2,3,4,0};

        try{
            try{
                int c=arr[1]/arr[4];
                System.out.println(c);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
        }
        finally{
            System.out.println("finally block");
        }
    }    
}
