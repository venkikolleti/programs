public class finally_Exception {

    static void meth() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("finally block");
        }
    }
    public static void main(String args[]) throws Exception{ 
        meth();
    }
}
