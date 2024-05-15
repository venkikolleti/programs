class mythread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+++" my thread");
        }
    }
}

public class yeild_thread {
    public static void main(String args[]){
        mythread t=new mythread();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+++" main");
            Thread.yield();
        }

    }
}
