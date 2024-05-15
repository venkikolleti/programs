// maze problem describes that how possible paths are there to reach from matrix topleft most to the last right most matrix corner...when we only left and right sides not to left the sides

import java.util.ArrayList;

public class maze_problem {
    public static void main(String[] args) {
        System.out.println(count(3,3));

        path("", 3, 3);

        System.out.println(path2("", 3, 3));


        System.out.println(pathDiagonal("", 3, 3));
    }
    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int down=count(r-1, c);
        int right=count(r,c-1);

        return down+right;
    }


    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){                  // 'D'--down  'R'--- right
            path(p+'D', r-1, c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }



    static ArrayList<String> path2(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll(path2(p+'D', r-1, c));    // 'D'--down  'R'--- right
        }
        if(c>1){
            ans.addAll(path2(p+'R',r,c-1));
        }

        return ans;
    }

    static ArrayList<String> pathDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1 && c>1){
            ans.addAll(pathDiagonal(p+'D', r-1, c-1));   // 'D'--diagonal  'v'-- vertical  'H'-- horizontal
        }
        if(r>1){
            ans.addAll(pathDiagonal(p+'V', r-1, c));
        }
        if(c>1){
            ans.addAll(pathDiagonal(p+'H',r,c-1));
        }

        return ans;
    }

}

