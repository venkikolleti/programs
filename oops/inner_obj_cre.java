class outer{

    void outer_method(){
        System.out.println("this is outer method");
    }

    class inner{
        void inner_method(){
            System.out.println("this is inner method");
        }
    }
}




public class inner_obj_cre {
    public static void main(String args[]){
        outer out=new outer();
        out.outer_method();

        outer.inner in=out.new inner();  //object creation for inner class........
        in.inner_method();

    }
}
