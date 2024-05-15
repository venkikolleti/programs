import java.util.*;
import java.util.Map.Entry;
public class map {
    public static void main(String args[]){
        Map<Integer,String> m=new Hashtable<>();
        //Map<Integer,String> m=new HashMap<>();
        //Map<Integer,String> m=new LinkedHashMap<>();
        //Map<Integer,String> m=new TreeMap<>();

        m.put(1,"venki");
        m.put(2, "kolleti");
        m.put(3, "venkaiah");

        System.out.println(m.get(1));

        //Retrival of keys...

        System.out.println(m.keySet());
        System.out.println(m.values());

        Set<Integer> keys=m.keySet();

        for (Integer key: keys) {
            System.out.println(key);
        }


        Collection<String> values=m.values();
        for(String string:values){
            System.out.println(string);
        }


        for(Integer key:keys){
            System.out.println(key+":"+m.get(key));
        }


        System.out.println(m);


        m.remove(1);

        System.out.println(m);

        m.put(4, "e3");
        m.put(5, "cse");
        System.out.println(m);

        System.out.println(m.containsKey(4));
        System.out.println(m.containsKey(14));


        System.out.println(m.containsValue("venkaiah"));
        System.out.println(m.containsValue("hello"));


        System.out.println(m);
        //update
        m.put(3,"venki");

        System.out.println(m);

        //add element if key not presented
        // If key is not presented than it will the element
        m.putIfAbsent(3,"venkaiah");
        System.out.println(m);

        //replace the element value....

        m.replace(4,"e3 cse");
        
        System.out.println(m);


        //size of the map


        System.out.println(m.size());


        Set<Entry<Integer,String>> entries=m.entrySet();

        for(Entry<Integer,String> entry:entries){
            Integer key=entry.getKey();
            String value=entry.getValue();
            System.out.println(key+" >>> "+value);
        }



        Map<Integer,String> h1=new HashMap<>();



    }
}
