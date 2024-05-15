public class arrays_two {
    public static void main(String[] args){

        //initialisation of two dimesional array...

        int[][] num;

        int[][] nums=new int[3][4];

        int[][] num1;
        num1=new int[2][3];



        //printing elements in two dimensional array by row by row.........

        int[][]num2={{3,4,5},{7,8,9}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(num2[i][j]+" ");
            }
        }
        System.out.println();





        //printing elements in two dimensional array by coloumn by coloumn.........

        int[][] num3={{11,22,33},{44,55,66}};
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.print(num3[j][i]+"  ");
            }
        }
        System.out.println();



        //2d array to method...
        int[][] integers={{1,3,6},{2,4,5},{7,8,9}};
        printArray(integers);


    }





    //printing A 2d array by using method.............

    public static void printArray(int[][] integers){
        for(int i=0;i<integers.length;i++){
            for(int j=0;j<integers[i].length;j++){
                System.out.print(integers[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
