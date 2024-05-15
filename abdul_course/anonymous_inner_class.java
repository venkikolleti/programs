abstract class My{
    abstract void display();
}

class OUter{
    public void meth(){
        My m=new My(){
            public void display(){
                System.out.println("hello hii");
            }
        };
        m.display();
    }
}

public class anonymous_inner_class {
    public static void main(String args[]){
        OUter o=new OUter();
        o.meth();


        

        My m=new My(){
            public void display(){
                System.out.println("hello hii");
            }
        };
        m.display();
    }
}
