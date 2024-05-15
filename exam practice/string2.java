public class string2 {
    public static void main(String args[]){
        String[] s={"a","bb","cc","d"};
        int count=0;

        int x=count(s,count);
        System.out.println("total number of strings with given length count::"+" "+x);
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    public static int count(String[] str,int count){
        for(int i=0;i<str.length;i++){
                
                if(str[i].length()==1){
                    count++;
                    System.out.println("string of given count in array:"+ str[i]);
                }
                //count++;
        }
        return count;
    }

}
