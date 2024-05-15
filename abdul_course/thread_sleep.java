class mythread extends Thread{
    public mythread(String name){
        super(name);
    }

    public void run(){
        int i=1;
        while(true){
            System.out.print(i+++" ");

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class thread_sleep{
    public static void main(String args[]){

        mythread t=new mythread("thread 1");
        t.start();
    }
}