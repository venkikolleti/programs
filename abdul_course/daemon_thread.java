class mythread extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i++);
        }
    }
}

public class daemon_thread {
    public static void main(String args[]){

        mythread t=new mythread();
        t.setDaemon(true);
        t.start();

        try{
            Thread.sleep(100);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
