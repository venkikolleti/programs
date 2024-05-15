import java.lang.reflect.Array;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Arrays;

public class searching {
    public static void main(String[] args){


        //searching elements
        int[] nums={3,5,88,33,4,-6};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"  ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(nums,33));
        System.out.println(Arrays.binarySearch(nums,-6));
        System.out.println(Arrays.binarySearch(nums,31)); 
    }
}
