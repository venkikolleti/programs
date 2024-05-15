class negativeDimensionException extends Exception{
    public String toString(){
        return "length or breadth not less than 0";
    }
}

public class throw_throws_defined_class {

    static int area(int l,int b) throws negativeDimensionException{
        if(l<0 || b<0)
            throw new negativeDimensionException();
        int a=l*b;
        return a;
    }
    public static void main(String args[]){

            try{
                int c=area(10,-5);
                System.out.println(c);

            }
            catch(negativeDimensionException e){
                System.out.println(e);
            }


    }
}
