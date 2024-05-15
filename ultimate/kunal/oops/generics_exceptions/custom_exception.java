
public class custom_exception extends Exception{
    public static void main(String[] args) {
        try{
            String name="venki";
            if(name.equals("venki")){
                throw new myException();
            }
        }catch(myException e){
            System.out.println(e+" hello");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class myException extends Exception{

}
