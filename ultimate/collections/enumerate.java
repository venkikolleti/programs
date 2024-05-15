import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class enumerate {
    public static void main(String[] args) {
        //iterate helps to iterate the any legacy collection objects from starting to ending

        //legacy collections---HashTable,Stack,Vector,Dictionary and properties
        //remaining are new classes..

        //Dictionary is abstract class


        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        Enumeration<Integer> e=v.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


        System.out.println();

        Hashtable<String,Integer> ages=new Hashtable<>();
        ages.put("India",500);
        ages.put("England",400);
        ages.put("usa",200);

        Enumeration<Integer> e1=ages.elements();
        while(e1.hasMoreElements()){
            System.out.println(e1.nextElement());
        }


    }
}
