import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arratlist_course {
    public static void main(String args[]){
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));

        System.out.println(al2);

        al1.add(10);
        al1.add(0,5);
        
        
        for(Integer x:al1)
            System.out.print(x+" ");
        System.out.println();

        //al1.addAll(al2);

        for(int i=0;i<al1.size();i++)
            System.out.print(al1.get(i)+" ");
            System.out.println();
        
        
        al1.addAll(1,al2);

        al1.forEach((x)->System.out.print(x+" "));

        System.out.println();

        System.out.println(al1.contains(50));

        System.out.println("index of 70: "+al1.indexOf(70));

        al1.add(5,70);

        System.out.println("last index of 70: "+al1.lastIndexOf(70));

        al1.set(6,100);

        Iterator<Integer> it=al1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        al1.forEach(System.out::println);
        System.out.println();





    }
}
