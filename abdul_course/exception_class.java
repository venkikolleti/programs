class lowBalanaceException extends Exception{
    public String toString(){
        return "Balance not less than 500";
    }
    public String ToString(){
        return "Balance should not be less than 500";
    }
}

public class exception_class {
    public static void main(String args[]){

        int balance=100;
        try{
            if(balance<500){
                throw new lowBalanaceException();
            }
        }
        catch(lowBalanaceException e){
            System.out.println(e);
            System.out.println(e.ToString());
        }
    }
}
