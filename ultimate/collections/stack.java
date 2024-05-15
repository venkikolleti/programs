import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;
import java.util.*;

public class stack {
    public static void main(String args[]){
        Vector<Integer> s=new Stack<>();
        s.add(20);
        System.out.println(s);

        List<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr);
       Object[] arr1=arr.toArray();
       System.out.println(Arrays.toString(arr1));


       Stack<String> s2=new Stack<>();
       s2.add("venki");
       s2.add("venkaiah");
       s2.add("kolleti");
       s2.add("cse");

       List<Integer> arr3=new Stack<>();
       
       // push
       // pop
       // peek
       // search


        s2.push("e3");
        s2.push("java");

        System.out.println(s2);

        System.out.println(s2.peek());


        System.out.println(s2.pop());

        System.out.println(s2);


        System.out.println(s2.search("e3"));
        System.out.println(s2.indexOf("e3"));

        System.out.println(s2.isEmpty());
        System.out.println(s2.empty());





    }
}