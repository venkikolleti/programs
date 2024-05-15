public class printing_format {
    public static void main(String args[]){
        int x=10,y=20;
        float f=10.58765f;

        System.out.println("sum "+x+y);
        System.out.println("sum "+(x+y));

        System.out.printf("%d \n",x);
        System.out.printf("%5d \n",x);
        System.out.printf("%05d \n",x);

        System.out.printf("%f\n",f);
        System.out.printf("%.2f\n",f);


        String str="hello";

        System.out.format("%s \n",str);
        
        System.out.format("%20s \n",str);
        System.out.format("%-20s \n",str);


        System.out.format("%d\n",x);
        System.out.format("%.4f\n",f);


        





    }
}
