import java.util.ArrayList;
import java.util.ListIterator;

public class listiterator {
    public static void main(String[] args) {
        //it is used for the list type collections only
        // bi-directional.....supports adding and removal of element...


        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        ListIterator<Integer> l=al.listIterator();

        while(l.hasNext()){
            System.out.println(l.next());
        }
        System.out.println();
        l.add(60);

        while(l.hasPrevious()){
            System.out.println(l.previous());
        }


        System.out.println(al);

    }
}
