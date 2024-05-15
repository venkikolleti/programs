import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.event.InternalFrameEvent;

public class variables {
    public static void main(String[] args){

        //variables...................


        String job="programmer";
        System.out.println(job);

        String name;
        name="kolleti";
        System.out.println(name);

        String name2=name;
        System.out.println(name2);

        int a=5;
        System.out.println(a);



        System.out.println("\n");




        // constants.....................

        final int pi=3;
        final String Name="venki";
        System.out.println(pi);
        System.out.println(Name);







        System.out.println("\n");

        //identifiers.......

        int $ab=6;
        System.out.println($ab);

        int _ab=2;
        System.out.println(_ab);







        System.out.println("\n");

        // data types.............

        int num=100;
        System.out.println(num);
        System.out.println(num-10);


        byte b1=12;
        System.out.println(b1);

        short s1=1000;
        System.out.println(s1);

        long l1=1000000000;
        System.out.println(l1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);







        System.out.println("\n");

        float f1=3.2f;
        float f2=3;
        System.out.println(f1);
        System.out.println(f2);

        double d1=4.6;
        System.out.println(d1);







        char c1='a';
        char c2='\u0041';
        char c3=59;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);








        boolean B1=5<10;
        boolean B2=10<5;
        System.out.println(B1);
        System.out.println(B2);
        




// string and its method........................
        
        String S1="venkaiah kolleti";
//upper and lower
        System.out.println(S1.toUpperCase());
        System.out.println(S1.toLowerCase());
//length
        int S2=S1.length();
        System.out.println(S2);
//isEmpty
        String S3="";
        System.out.println(S1.isEmpty());
        System.out.println(S3.isEmpty());
//charAt
        char C1=S1.charAt(3);
        System.out.println(C1);

//indexOf
        System.out.println(S1.indexOf('k'));
        System.out.println(S1.indexOf(' '));
        System.out.println(S1.indexOf('a'));
       
//concat
        String S4=S1.concat(" E1 CSE");
        System.out.println(S4);     
        
        
//concatenation

        String S5="venki";
        String S6="kolleti";
        System.out.println(S5+S6);
        System.out.println("heyy java"+2+6);
        System.out.println("hello"+"world"+(2+5));
        System.out.println("hello".concat("world".concat("33")));




//initiating string object

        String S7="rkv";
        String S8="rkv";
        String S9=new String("rkv");
        System.out.println(S7);
        System.out.println(S8);
        System.out.println(S9);






//strings immutable
        String A1="value";
        A1="new value";
        System.out.println(A1);





// type casting...............

//implict type conversion

        double D1=4;
        double D2=2.9f;
        long L1=111;
        System.out.println(D1);
        System.out.println(D2);
        System.out.println(L1);

//explict type conversion

        int I1=(int)5.3;
        int I2=(int)4L;
        float F2=(float)6.4;
        System.out.println(I1);
        System.out.println(I2);
        System.out.println(F2);



    }
}
