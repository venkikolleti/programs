import java.io.*;
public class file_writer {
    public static void main(String[] args) {
        //true is used to appedn the data ,if we remove it than it will not append it will replace the things..
        try(FileWriter fw=new FileWriter("notes.txt",true)){ 
            fw.write("heyyy raa ");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
