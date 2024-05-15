import java.util.LinkedList;

public class linkedList_built_in {
    public static void main(String args[]){
        LinkedList<Integer> l=new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        System.out.println(l);

        l.remove(3);
        System.out.println(l);

        l.set(2,45);
        System.out.println(l);

        System.out.println(l.contains(50));
        System.out.println(l.contains(500));

        System.out.println(l.size());

        l.add(2,100);
        System.out.println(l);

        l.remove(Integer.valueOf(50));
        System.out.println(l);

        System.out.println(l.indexOf(20));

        

    }
}
