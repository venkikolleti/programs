
public class throw_throws_exception {

    public static int area(int a,int b)throws Exception{
    
            if(a<0 || b<0)
                throw new Exception("length or breadth not less than 0");
            int c=a*b;
            return c; 
        
    }

    static void meth(){
        try{
        int a=area(-10,5);
        System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }



    public static void main(String args[]){
        meth();
        
    }
}
