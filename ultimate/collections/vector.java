import java.util.*;

import javax.sound.midi.SysexMessage;
public class vector {
    public static void main(String args[]){
        Vector v=new Vector();
        v.add(10);

        v.add("venki");
        v.add(5.6);
        v.add(34);

        Vector v2=new Vector();
        v2.add(10);
        v2.add(20);
        v2.add(30);
        v2.add(0,5);

        v.addAll(v2);

        System.out.println(v2);
        System.out.println(v);

        System.out.println(v.contains(10));

        v2.remove(Integer.valueOf(10));
        System.out.println(v2);


        v2.set(1,500);
        System.out.println(v2);

        System.out.println(v.size());
        System.out.println(v.capacity());

        System.out.println(v.get(1));
        System.out.println(v.indexOf("venki"));

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        Object[] arr=v.toArray();

        System.out.println(Arrays.toString(arr));

        Object[] arr1=new Object[]{1,2,3,4};
        
        Vector v3=new Vector(Arrays.asList(arr1));

        System.out.println(v3);



        Vector<Integer> v4=new Vector<>();

        v4.add(10);
        v4.add(20);
        v4.add(30);
        v4.add(40);
        v4.add(50);
        System.out.println(v4);




                


    }
}
