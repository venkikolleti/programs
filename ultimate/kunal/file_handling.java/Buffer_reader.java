import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer_reader {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("you typed: "+br.readLine());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
