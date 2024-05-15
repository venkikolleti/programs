import java.io.FileReader;
import java.io.InputStreamReader;

public class fileReader {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("data.txt")){
            int letters=fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
                letters=fr.read();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        try(FileReader fr1=new FileReader("notes.txt")){
            int data;
            while((data=fr1.read())!=-1){
                System.out.println((char)data);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
