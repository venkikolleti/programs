public class c{
    public static void main(String[] args) {
        orange(3);
        System.out.println(palin("abba"));
    }
    static void orange(int num){
        int i=0;
        int sum=6;
        int val=5;
        while(i<num){
            System.out.print(sum+" ");
            sum+=val;
            val+=5;
            i++;
        }
        System.out.println();

    }

    static String palin(String s){
        String ans="jiashdiauhiuhiuhiuhihiuhiu";
        String str=s+s;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(isPalin(str.substring(i,j))){
                    if(str.substring(i,j).length()<=ans.length()){
                        ans=str.substring(i, j);
                    }
                }
            }
        }
        return ans;
    }
    static boolean isPalin(String str){
        if(str.length()<=1){
            return false;
        }
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}