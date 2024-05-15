import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        // add from the tail...delete from the head...
        //default capacity of priority queue is 11
        //queue mwthods

        //add elements----add,offer,addAll
        //retrival------peek
        //Removal--------poll,remove
        //check-----contains
        
        //generally integers lowest number has highest priority..
        // In the Prority Queue always the head(starting) element points to the highest priority value....
                //remaining values are placed randomly..

        pq.add(100);
        pq.offer(200);
        pq.offer(300);
        pq.add(400);
        pq.offer(150);
        pq.offer(250);
        pq.add(50);

        System.out.println(pq);


        System.out.println(pq.peek());

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.remove());

        System.out.println(pq);

        System.out.println(pq.contains(250));
        System.out.println(pq.contains(50));

        System.out.println(pq);

        for(Integer num:pq){
            System.out.println(num);
        }

        System.out.println();

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


        System.out.println("\n"+pq);





        //changing the priority....highest value has the highest priority....


        PriorityQueue<Integer> p=new PriorityQueue<>(Comparator.reverseOrder());

        p.offer(10);
        p.add(5);
        p.offer(15);
        p.add(8);
        p.offer(20);
        p.add(9);

        System.out.println(p);
        System.out.println();


        while(!p.isEmpty()){
            System.out.println(p.poll());
        }
            
    }
}
