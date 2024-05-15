import java.util.PriorityQueue;

public class priorityqueue_minheap {
    public static void main(String args[]){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

        System.out.println(p.peek());
        p.forEach((x)->System.out.print(x+" "));
        System.out.println();

        p.poll();

        p.forEach((x)->System.out.print(x+" "));

        System.out.println();

        System.out.println(p.element());


        p.offer(100);
        p.forEach((x)->System.out.print(x+" "));

        System.out.println();


        System.out.println(p.size());




    }
}
