import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class fcfs {
    public static void main(String[] args) {
        int[] process={1,2,3};
        int[] AT={2,1,0};
        int[] burtsTime={4,5,7};
        arrival(process, AT, burtsTime);
    }
    static void arrival(int[] process,int[] at,int[] bt){
        String[] wt1=new String[process.length];
        int[] wt=new int[process.length];
        int[] tat=new int[process.length];
        int[] turn=new int[process.length];
        int[] wait=new int[process.length];


        int count=0,add=0,ad=0,sum=0;
        for(int i=0;i<process.length;i++){
            for(int j=0;j<process.length;j++){
                if(at[j]==count){
                    sum=sum+bt[j];
                    wt1[add++]=sum+"p"+(j+1);
                    wt[ad++]=sum;
                }
            }
            count++;
        }
        
        for(String w:wt1){
            System.out.println(w);
        }
        System.out.println();
        

        for(int i=0;i<process.length;i++){
            Pattern p = Pattern.compile("[0-9]+");
            Matcher m = p.matcher(wt1[i]);
            int n=0;
            while (m.find()) {
                n = Integer.parseInt(m.group());
                // append n to list
            }
            tat[i]=n;
        }
        for(int i:tat){
            System.out.println(i);
        }


        int coun=1;
        for(int i=0;i<process.length;i++){
            for(int j=0;j<process.length;j++){
                if(tat[j]==coun){
                    turn[i]=wt[j]-at[i];
                }
            }
            coun++;
        }

        System.out.println();

        for(int t:turn){
            System.out.println(t);
        }

        for(int i=0;i<process.length;i++){
            wait[i]=turn[i]-bt[i];
        }

        System.out.println();
        for(int k:wait){
            System.out.println(k);
        }
    }
}
