import java.util.LinkedList;
import java.util.List;

public class linkedlist_course {
    public static void main(String args[]){
        LinkedList<Integer> al1=new LinkedList<>();

        LinkedList<Integer> al2=new LinkedList<>(List.of(50,60,70,80,90));
        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);

        for(Integer x:al1)
            System.out.print(x+" ");
        System.out.println();
        
    }
    
}
