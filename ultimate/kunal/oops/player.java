import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class player{
    public static void main(String[] args) throws FileNotFoundException {
        CricketPlayer c1=new CricketPlayer("virat", 35, 18, "Batsman", "INDIA", 63.5f, 1, 26000);
        System.out.println(c1);
        

        //System.out.println(sc.nextLine());
        /*String line=sc.nextLine();
        String[] arr=line.split(" ");
        System.out.println(Arrays.toString(arr));
        String name=arr[0];
        int age=Integer.valueOf(arr[1]);
        int jersyNo=Integer.valueOf(arr[2]);
        String role=arr[3];
        String ct=arr[4];
        float avg=Float.valueOf(arr[5]);
        int rank=Integer.valueOf(arr[6]);
        int runs=Integer.valueOf(arr[7]);

        CricketPlayer c2=new CricketPlayer(name, age, jersyNo, role, ct, avg, rank, runs);
        System.out.println(c2);
*/
        try{
        CricketPlayer[] cp=new CricketPlayer[3];
        FileReader fr=new FileReader("players.txt");
        Scanner sc=new Scanner(fr);
        String line="";
        int num=0;
        
        while((line=sc.nextLine())!=null){
            String[] arr=line.split(" ");
            cp[num]=new CricketPlayer(arr[0],Integer.valueOf(arr[1]),Integer.valueOf(arr[2]), arr[3], arr[4], Float.valueOf(arr[5]), Integer.valueOf(arr[6]),Integer.valueOf(arr[7]));
            num=num+1;
            if(num==3){
                for(int i=0;i<3;i++) {
                    System.out.println(cp[i]);
                }
            }
        }
        

    }catch(Exception e){
        //System.out.println(e);
    }

    }
}


class Player {   
    String name;
    int age;
    int jersyNo;
    String role;
    String country;
    Player(String name,int age, int jn,String role,String cn){
        this.name=name;
        this.age=age;
        this.jersyNo=jn;
        this.role=role;
        this.country=cn;
    }

    public String toString(){
        return "Name: "+name+"\t Age: "+age+"\tJerseyNO: "+jersyNo+"\trole: "+role+"\t country: "+country;
    }
}

class CricketPlayer extends Player{
    float avg;
    int rank;
    int runs;
    CricketPlayer(String name,int age, int jn,String role,String cn,float avg,int rank,int runs){
        super(name,age,jn,role,cn);
        this.avg=avg;
        this.rank=rank;
        this.runs=runs;
    }
    public String toString(){
        return super.toString()+"\t Avg: "+avg+"\trank: "+rank+"\t runs: "+runs;
    }
}
