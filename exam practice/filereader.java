import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class filereader {
    public static void main(String args[]) throws IOException{
        FileReader fr=new FileReader("Number.java");
        BufferedReader b=new BufferedReader(fr);
        Scanner sc=new Scanner(fr);
        System.out.println(b.readLine());
        try{
        System.out.println(sc.next());
            
        }catch(Exception ae){
                System.out.println(ae);
        }
        
        fr.close();
    }
}
