class Mythread extends Thread{
    public Mythread(String name){
        super(name);
        
    }
}

public class thread_getters {
    public static void main(String args[]){
        
        Mythread t=new Mythread("my thread 1");
        System.out.println(t);
        System.out.println("id "+t.getId());
        System.out.println("name "+t.getName());
        System.out.println("priority "+t.getPriority());
        System.out.println("state "+t.getState());
        System.out.println("alive "+t.isAlive());

        t.start();
        System.out.println("State "+t.getState());

        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println("priority "+t.getPriority());

        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println("priority "+t.getPriority());







    }
}
