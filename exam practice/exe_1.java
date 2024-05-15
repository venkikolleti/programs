class AgeException extends Exception{
    AgeException(String s){
        super(s);
    }
}

public class exe_1 {
    public static void main(String args[]){
        int age=16;
        try{
            if(age<18){
                throw new AgeException("not eleigible for vote");
            }
            else{
                System.out.println("eleigible for vote");
            }
        }catch(AgeException a){
            System.out.println(a);
        }
    }
}
