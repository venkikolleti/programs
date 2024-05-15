import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {

        permutate("", "abc");
        System.out.println(li);


    }

    static ArrayList<String> li=new ArrayList<>();
    static void permutate(String complete,String remaining){
        if(remaining.isEmpty()){
            li.add(complete);
            return;
        }
        char ch=remaining.charAt(0);
        for(int i=0;i<=complete.length();i++){
            String s=complete.substring(0, i);
            String p=complete.substring(i, complete.length());

            permutate(s+ch+p, remaining.substring(1));

        }
    }



    /*static ArrayList<String> permList(String complete,String remaining){
        if(remaining.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(complete);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=remaining.charAt(0);
        for(int i=0;i<=complete.length();i++){
            String s=complete.substring(0, i);
            String p=complete.substring(i, complete.length());

            ans.add(permList(s+ch+p, remaining.substring(1)));

        }

        return ans;
    }*/



}