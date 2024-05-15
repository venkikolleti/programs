

public class exception_handling1 {
    public static void main(String[] args) {
        try{
            divide(10,0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("this will always execute");
        }


        System.out.println();

        try{
            throw new Exception("just for fun");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("this is finally block,it will always execute");
        }
        



    }

    static int divide(int a,int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("Do not divide with zero");
        return a/b;
    }
}
