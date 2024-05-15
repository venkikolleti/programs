class outer{
    private int outerX;

    class inner{
        public int innerX;

        void get(){
            System.out.println(outerX+"    \t"+innerX);
            System.out.println("above is inner");
        }
    }
    public void num( ){
        inner i1=new inner();
        i1.innerX=9;
        i1.get();
        System.out.println("this is outer");
    }
    
}

public class inner_class {
    public static void main(String args[]){
        outer out=new outer();
        outer.inner inn=out.new inner();
        
        inn.innerX=10;
        inn.get();
        out.num();

    }
}
