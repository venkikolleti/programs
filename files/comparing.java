import java.lang.reflect.Array;
import java.util.Arrays;

public class comparing {
    public static void main(String[] args){

        //comparing arrays
        int[] num1={2,4,6,8};
        int[] num2={2,4,6,8};
        int[] num3={2,5,7,8};

        System.out.println(num1==num2);
        System.out.println(Arrays.equals(num1,num2));
        System.out.println(Arrays.equals(num1,num3));


        


        //equals method.....

        String str1=new String("hello");
        String str2=new String("hello");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));







        //filling arrays...................

        int[] num_1=new int[5];
        Arrays.fill(num_1,6);
        for(int i=0;i<num_1.length;i++){
            System.out.print(num_1[i]+"  ");
        }
        System.out.println();
        

        //filling array value to certain range.........

        int[] num_2=new int[8];
        Arrays.fill(num_2,3,6,7);
        for(int i=0;i<num_2.length;i++){
            System.out.print(num_2[i]+"  ");
        }
        System.out.println();








        //printing array................

        int[] num4={1,2,3,4};
        System.out.println(Arrays.toString(num4));


        String[] str_1={"rgukt","rkv","ong"};
        System.out.println(Arrays.toString(str_1));





        //variable-length argument list.........
        sum(1,2,3);
        sum(11,22,33,44,55);
        sum(new int[] {4,88,9,77});
        int[] num_8={100,200,300};
        sum(num_8);


    }

    public static void sum(int... num_7){
        for(int i=0;i<num_7.length;i++){
            System.out.print(num_7[i]+"  ");
        }
        System.out.println();
    }
}
