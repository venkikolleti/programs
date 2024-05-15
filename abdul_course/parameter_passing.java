public class parameter_passing {
    static void name(int A[],int a,String s){
        A[0]=25;
        a=10;
        s="venki";
        System.out.println(a+" "+s);
        for(int i:A){
            System.out.println(i);
        }
    }


    static void sd(String str){
        str="programm";
        System.out.println(str);
    }
    public static void main(String args[]){
        int A[]={1,3,4,5,6};
        int a=20;
        String s="java";

        System.out.println(a+" "+s);
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println();
        name(A,a,s);

        System.out.println(a+" "+s);
        for(int i:A){
            System.out.print(i+" ");
        }
        System.out.println();




        String str="pro";
        System.out.println(str);

        sd(str);
      //  System.out.println(str);




        
    }
}
