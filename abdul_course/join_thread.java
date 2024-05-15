class mythread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i++);
        }
    }
}

public class join_thread {
    public static void main(String args[]) throws Exception{

        mythread t=new mythread();
        t.setDaemon(true);
        t.start();
        Thread th=Thread.currentThread();
        th.join();
    }
}
