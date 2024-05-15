import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.*;
public class iterate1 {
    public static void main(String[] args) {
        Vector<Integer> a=new Vector<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);


        System.out.println(a);
        

        Enumeration<Integer> e=a.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        ArrayList<Integer> al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);
System.out.println();
        System.out.println(al);

        java.util.Iterator<Integer> i=al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
