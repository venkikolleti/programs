class my extends Thread{
    public void run(){
        int i=1;
        while(i<100){
            System.out.println(i+" run");
            i++;
        }
    }
    public void run1(){
        int i=1;
        while(i<100){
            System.out.println(i+" run 1");
            i++;
        }
    }
}

class th extends my{
    public void run(){
        int i=1;
        while(i<100){
            System.out.println(i+" hello");
            i++;
        }      
    }
}

public class threads_multiple {
    public static void main(String args[]){
        my m=new my();
        m.start();
        m.run1();
        th t=new th();
        t.start();
        t.run1();
     

    }
}
