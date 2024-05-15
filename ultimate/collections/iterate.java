import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class iterate {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);
    Iterator<Integer> it = numbers.iterator();
    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }
    System.out.println(numbers);







    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("venki",10);
    hm.put("kolleti",20);
    hm.put("venkaiah",40);

    Iterator<Integer> h=hm.values().iterator();
    while(h.hasNext()){
        System.out.println(h.next());
    }


    Iterator<String> s=hm.keySet().iterator();

    while(s.hasNext()){
        System.out.println(s.next());
    }
    
  }
}