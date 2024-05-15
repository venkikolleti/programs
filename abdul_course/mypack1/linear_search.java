public class linear_search {
    public static void main(String args[]){
        String name="venkaiah kolleti";
        char target='o';
        System.out.println(search(name,target));
        System.out.println(search1(name,target));
    }
    
    static int search(String name,char target){
        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    static boolean search1(String name,char target){
        for(char c:name.toCharArray()){
            if(target==c){
                return true;
            }
        }
        return false;
    }
}
