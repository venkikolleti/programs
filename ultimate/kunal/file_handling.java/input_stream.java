import java.io.InputStreamReader;

public class input_stream {
    public static void main(String[] args) {
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.print("Enter some letters: ");
            int letters=isr.read();  //taking the input as the byte stream
            while (isr.ready()) {
                System.out.println((char)letters);
                letters=isr.read();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
