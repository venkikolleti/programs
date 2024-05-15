import java.util.*;

public class linkedlist {
    public static void main(String args[]){
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);


        System.out.println(l1);

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(100);
        arr.add(200);

        l1.addAll(arr);
        l1.remove(Integer.valueOf(20));
        System.out.println(l1);

        l1.removeAll(arr);
        System.out.println(l1);

        System.out.println(l1.contains(10));

        Collections.synchronizedList(l1);

        

        
    }
}
