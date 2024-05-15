public class remove_A_From_String {
    public static void main(String[] args) {
        String str="baccad";
        System.out.println(remove(str));
        System.out.println(remove2(str, "", 0));
        
        System.out.println(str.length());
    }
    static String remove(String str){
        String newStr=str.replaceAll("a", ""); // By using in-built method
        return newStr;
    }

    static String remove2(String str,String newstr,int index){
        if(index==str.length()){
            return newstr;
        }
        if(str.charAt(index)!='a'){
            newstr=newstr+str.charAt(index);
        }
        return remove2(str, newstr, index+1);
    }


}
