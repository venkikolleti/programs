class test  implements Runnable {
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" hello");
            i++;
        }
    }
}


public class multithreading_runnable{
    public static void main(String args[]){

        test t=new test();
        Thread th=new Thread(t);
        th.start();
                int i=1;
        while(true){
            System.out.println(i+" world");
            i++;
        }
    }
}

