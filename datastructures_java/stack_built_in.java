import java.util.*;
public class stack_built_in {
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);


        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        s.push(40);
        s.push(50);

        System.out.println(s);

        System.out.println(s.peek());


        System.out.println(s.search(10));
        System.out.println(s.search(40));
        System.out.println(s.search(50));


        System.out.println(s.isEmpty());




    }
}
