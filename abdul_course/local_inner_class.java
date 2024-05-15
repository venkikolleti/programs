class Outer{
    void display(){
        class inner{
            void innerdisplay(){
                System.out.println("hello");
            }
        }
        inner i=new inner();
        i.innerdisplay();
    }
}


public class local_inner_class {
    public static void main(String args[]){

        Outer o=new Outer();
        o.display();
    }
}
