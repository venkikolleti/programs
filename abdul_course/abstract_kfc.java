abstract class kfc{
    kfc(){
        System.out.println("kfc constructor");
    }

    void listitems(){
        System.out.println("chicken"+" , "+"special biryani");
    }

    abstract void billing();
    abstract void offer();
}

class mykfc extends kfc{
    mykfc(){
        System.out.println("mykfc constructor");
    }
    public void billing(){
        System.out.println("billing completed");
    }
    public void offer(){
        System.out.println("20% discount offer ");
    }

    public void festoffer(){
    System.out.println("40% discount festoffer");
    }
}

public class abstract_kfc {
    public static void main(String args[]){

        kfc k=new mykfc();
        k.listitems();
        k.billing();
        k.offer();

        System.out.println();

        mykfc m=new mykfc();
        m.listitems();
        m.billing();
        m.offer();
        m.festoffer();
            
    }
}
