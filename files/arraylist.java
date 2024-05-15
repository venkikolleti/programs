import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthEditorPaneUI;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> nums=new ArrayList<>();
        ArrayList<String> names=new ArrayList<>();


        //to add elements to the arrayList...

        names.add("rkv");
        names.add("rgukt");
        names.add("ong");

        System.out.println(names);


        //to add elements in the particular index......

        names.add(1,"nuz");
        System.out.println(names);


        //to access the elements in the arrayList....

        System.out.println(names.get(0));
        System.out.println(names.get(1));


        // to change or replace the element in the arrayLsit......

        names.set(2,"kolleti");
        System.out.println(names);


        //remove element from the list......
        names.remove(0); //by index value
        names.remove("kolleti"); //direct value

        System.out.println(names);



        //to know size of the array......

        System.out.println(names.size());


        
        
        //sort the arrayList......
        names.add("rkv");
        names.add("kvk");

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
















        //for each loop.......................

        ArrayList<String> names_1=new ArrayList<>();
        names_1.add("venki");
        names_1.add("Ashok");
        names_1.add("venkatesh");

        for(String name:names_1){
            System.out.println(name+"  ");
        }


        String[] names_2={"ganii","deepu","sudha","venky"};
        for(String name:names_2){
            System.out.println(name+"  ");
        }


        
    }
}
