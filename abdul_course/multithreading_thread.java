public class multithreading_thread extends Thread{

    public void run(){
        int i=1;
        while(true){
            System.out.println(i+" hello");
            i++;
        }
    }
    public static void main(String args[]){

        multithreading_thread t=new multithreading_thread();
        t.start();
        int j=1;
        while(true){
            System.out.println(j+" world");
            j++;
        }
    }
}
