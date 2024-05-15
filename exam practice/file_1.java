import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.synth.SynthStyle;

public class file_1 {
    public static void main(String args[]) throws IOException{
    File f=new File("venki.txt");
    boolean b=f.createNewFile();
    if(b){
        System.out.println("file already created");
    }
    else{
        System.out.println("file created");
    }        
    

    
    FileWriter fw=new FileWriter("venki.txt");
    fw.write("new");
    
   

    FileReader fr=new FileReader("filehandling.java");
    char c[]=new char[1001];
    //fr.read(c);
    //System.out.println(c);
    String line=" ";
    int count=0;
    BufferedReader br=new BufferedReader(fr);
    while((line=br.readLine())!=null){
        count++;
        fw.write(line+"\n"); 
        
    }

    
    
    System.out.println(count);

    String s="venki kolleti";
    int j=0;
    try{
    for(;;){
        
        if(s.charAt(j)=='\u0000'){
            break;   
        }
        j++;
    }
    }
        catch(Exception e){
            System.out.println(e);
        }
        
    
    
    System.out.println(j);



    fw.close();
    fr.close();
    

}
}
