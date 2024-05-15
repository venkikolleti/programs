import java.io.*;
import java.io.File;
import java.util.*;

public class filehandling {
    public static void main(String args[]){
        System.out.println("file creation");
        try{
            File f=new File("abc.txt");
            boolean b=f.createNewFile();
            if(b){
                System.out.println("file is created");
            }
            else{
                System.out.println("file already created");
            }
        }catch(Exception ae){
            System.out.println(ae);
        }
        finally{
            System.out.println("file is creater inside the finally block");
        }

        try{
        FileWriter fw=new FileWriter("abc.txt");
        String data;
        Scanner sc=new Scanner(System.in);
        data=sc.nextLine();
        fw.write(data);
        fw.close();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
        FileReader fr=new FileReader("Number.java");
        char c[]=new char[1000];
        fr.read(c);
        System.out.println(c);
        fr.close(); 
        }catch(Exception a){
            System.out.println(a);
        }

    }
   


}
