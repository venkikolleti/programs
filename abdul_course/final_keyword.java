class my{
    final int MIN=1;
    final int MAX;
    my(){
        MAX=10;
    }

    final void meth1(){
        System.out.println("hello");
    }
}



public class final_keyword {
    public static void main(String args[]){

        my m=new my();

        System.out.println(m.MIN);
        System.out.println(m.MAX);
    }
}
