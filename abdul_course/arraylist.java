import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String ...args){
        ArrayList<Integer> num=new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);

        System.out.println(num);

        num.remove(1);
        System.out.println(num);

        System.out.println(num.size());


        for(int i=0;i<num.size();i++){
            System.out.println(num.get(i));
        }

        num.add(6);

        Collections.sort(num);

        System.out.println(num); 



        
    }
}
