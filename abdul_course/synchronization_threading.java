class mydata{
    synchronized public void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
            try{
                Thread.sleep(100);
            }
            catch(Exception e){

            }
        }
    }
}


class mythread1 extends Thread{
    mydata d;
    public mythread1(mydata d){
        this.d=d;
    }
    public void run(){
        
        d.display("Hello world");
    }
}


class mythread2 extends Thread{
    mydata d;
    public mythread2(mydata d){
        this.d=d;
    }
    public void run(){
       
        d.display("welcome all");
    }
}

public class synchronization_threading {
    public static void main(String args[]){

        mydata d=new mydata();

        mythread1 t1=new mythread1(d);
        mythread2 t2=new mythread2(d);

        t1.start();
        t2.start();
    }
}
