

class AgeException extends Exception{
    AgeException(String s){
        super(s);
    }
}


public class Age_Exception{
    public static void main(String args[]){
        int age=13;
        try{
            if(age<18){
                throw new AgeException("you are not eligible");
            }
            else{
                System.out.println("you are not eligible");
            }
        }catch(AgeException a){
            System.out.println(a);
        }
    }
}
