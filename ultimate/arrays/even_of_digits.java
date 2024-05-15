public class even_of_digits {
    public static void main(String args[]){
        int[] arr={1,45,76,23,2,5663};
        System.out.println(count1(arr));
    }
    static int count1(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(prime1(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean prime(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        //return (int)(Math.log10(num)+1);
        if(count%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    static boolean prime1(int num){
        String str=String.valueOf(num);
        int len=str.length();
        if(len%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}