public class string_reverse {
    public static void main(String[] args) {
        String s="hello world   ";
        int count=0;
        /*while(s[::-1]!=" "){
            count++;
        }*/

        int i=s.length()-1;
        while(s.charAt(i)==' ' && i>=0){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        System.out.println(count);

        int k=s.indexOf("helloooo");
        System.out.println(k);
        
    }

}
