import java.util.*;

public class set {
    public static void main(String args[]){
        // set doesnt allow the duplicate elements....

        //HashSet----Internally uses HashMap to store the value.........HashMap stores like array of nodes (Key,value)

        //HashSet stores the value in the random manner....

        //default adding values by user are keys.....values are inserted internally dummy(Object)
        Set<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(5);
        hs.add(15);
        hs.add(30);
        hs.add(25);
        hs.add(5);
        hs.add(10);



        System.out.println(hs);

        System.out.println(hs.remove(30));//passing value

        System.out.println(hs);

        System.out.println(hs.contains(25));

        System.out.println(hs);


        //cant retrieve by get methods

        System.out.println();
        for(Integer element:hs){
            System.out.println(element);
        }





        //Linked hashset internally extends linkedHashMap way of storing...
        //store the values in the order we inserted in the list

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);

        System.out.println(lhs);

        System.out.println(lhs.remove(40));
        System.out.println(lhs);






        // internally implements treeMap
        //maintain the sorted order...


        System.out.println();
        System.out.println();


        TreeSet<Integer> ts=new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(15);
        ts.add(5);
        ts.add(30);
        ts.add(25);

        System.out.println(ts);

        System.out.println(ts.first());
        System.out.println(ts.last());
        
        
        

        System.out.println(ts.subSet(10,20));

        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());

        System.out.println(ts);


        System.out.println(ts.descendingSet());

        System.out.println(ts);



    }
}
