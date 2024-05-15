public class pattern1{
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
            System.out.println();
            System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print((i+j)+" ");
            }
            System.out.println();
        }
            System.out.println();
            System.out.println();


        int count=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println();
        }
                    System.out.println();
            System.out.println();


        String str[]={"java","c++","python"};
        int arr[]={100,4,20};
        for(int i=0;i<str.length;i++){
            System.out.format("%-20s %03d",str[i],arr[i]);
            System.out.println();

        }

            System.out.println();
            System.out.println();


        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
                System.out.println();


        for(int i=1;i<=5;i++){
            for(int k=4;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

            System.out.println();
            System.out.println();



        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(i<=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


            System.out.println();
            System.out.println();



        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i+j)>5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
  
            System.out.println();
        }




    }
}
