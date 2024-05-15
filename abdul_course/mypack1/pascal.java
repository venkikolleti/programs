import java.lang.reflect.Array;

public class pascal {
    public static void main(String args[]){
        int rows=5,num=1;
        for(int i=0;i<rows;i++){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            num=1;
            for(int k=0;k<=i;k++){

                System.out.print(num+" ");
                num=num*(i-k)/(k+1);
            }
            System.out.println();
        }


        String s="java program me";
        String s1[]=s.split(" ");
        String newstr="";
        for(String i:s1){
            newstr=i+" "+newstr;
        }
        System.out.println(newstr);




/* 
        int row=5, i, j, space, num;
      for(i=0; i<row; i++)
      {
         for(space=row; space>i; space--)
         {
            System.out.print(" ");
         }
         num=1;
         for(j=0; j<=i; j++)
         {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.print("\n");
      }

    */
    }
}
