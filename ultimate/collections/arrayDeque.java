import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String args[]){
        //default capacity 17
        //this is simply like dequeue(double ended queue)..... we can add or remove from both ends....

        //add element------offer,offerLast,offerFirst,add,addFirst,addLast,addAll
        //retrival--------peek,peekFirst,peekLast
        //removal---------poll,pollFirst,pollLast,remove,removeFirst,removeLast

        // doesnt follow any pririoty order add as we inserted
        ArrayDeque<String> ad=new ArrayDeque<>();
        ad.add("apple");
        ad.addFirst("banana");
        ad.offer("mango");
        ad.offerLast("kiwi");
        ad.offerFirst("guava");

        System.out.println(ad);


        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());


        System.out.println(ad.pollLast());
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad);


    }
}
