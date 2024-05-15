class My{
    static int s;
    static{
        System.out.println("Block 1");
        s=10;
    }
    static{
        System.out.println("Block 2");
    }
}


public class static_blocks {
    public static void main(String args[]){

        My m=new My();
        System.out.println(m.s);
        
    }
}
