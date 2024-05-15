import javax.swing.plaf.synth.SynthStyle;

public class arrays_single {
    public static void main(String[] args){

        //array initialisation............

        int[] num={1,2,3,4};//integers arraay

        char[] a1={'k','r'}; //character array
        String[] strs={"kolleti","rkv","kvk"};//string array

        // array initialisation.....................
        int[] nums=new int[4];
        nums[0]=9;
        nums[1]=6;
        nums[2]=8;
        nums[3]=5;


        

        //printing array elements...........
    
        System.out.println(num);  //givs address of the array...

        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+"\t");
        }
        System.out.println(" ");



        for(int i=0;i<strs.length;i++){
            System.out.print(strs[i]+"\t");
        }
        System.out.println(" ");







        //passing array to methods......

        int[] numbers={0,1};
        change(numbers);
        printArray(numbers);



        System.out.println(" ");
        //returning arrays from methods....

        int[] num_s=getnum();
        print(num_s);

    
    }








        //passing array to methods............

    public static void change(int[] numbers){
            numbers[0]=1;
            numbers[1]=0;
    }
    public static void printArray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+"\t");
        }
    }





    //returning array from methods..............

    public static int[] getnum(){
        int[] num_s={1,2,3,4};
        return num_s;
    }

    public static void print(int[] num_s){
        for(int i=0;i<num_s.length;i++){
            System.out.print(num_s[i]+"\t");
        }
    }




}
