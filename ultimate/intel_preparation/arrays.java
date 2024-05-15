import java.util.*;

public class arrays {
    public static void main(String args[]){
        show(10,20);
        List<Integer> li=new ArrayList();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.remove(1);
        System.out.println(li.size());
        System.out.println(li.indexOf(4));
        System.out.println(li);
        li.remove(Integer.valueOf(5));
        for(int x:li){
            System.out.println(x);
        }
    }

    static void show(int...x){
        for(int a:x){
            System.out.println(a);
        }
    }
}
