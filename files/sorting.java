import java.util.Arrays;

public class sorting {
    public static void main(String[] args){

        //sorting of integer array................

        int[] nums={4,67,9,12,-3,0,5};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"  ");
        }
        System.out.println();




        //sorting of character array........

        char[] chars={'a','h','t','B','D','L','z'};
        Arrays.sort(chars);
        for(int i=0;i<chars.length;i++){
            System.out.print(chars[i]+"  ");
        }
        System.out.println();





        //sorting array of integer array of unicode(letters).....

        int[] unicodes={'a','h','t','B','D','L','z'};
        Arrays.sort(unicodes);
        for(int i=0;i<unicodes.length;i++){
            System.out.print(unicodes[i]+"  ");
        }
        System.out.println();





        //sortng of array to certain range.........

        int[] num_s={4,7,2,99,0,-1,-4};
        Arrays.sort(num_s,3,7);
        for(int i=0;i<num_s.length;i++){
            System.out.print(num_s[i]+"  ");
        }





        
    }
}
