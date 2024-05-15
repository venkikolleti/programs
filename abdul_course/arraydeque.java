import java.util.ArrayDeque;

public class arraydeque {
    public static void main(String args[]){
        ArrayDeque <Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.forEach((x)->System.out.println(x));

        System.out.println(dq.peek()+"\n");

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);

        dq.forEach((x)->System.out.println(x));
        System.out.println(dq.peek()+"\n");

        System.out.println("deleted element is: "+dq.poll());

        dq.forEach((x)->System.out.println(x));



    }
}
