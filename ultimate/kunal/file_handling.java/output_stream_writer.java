import java.io.IOException;
import java.io.OutputStreamWriter;

public class output_stream_writer {
    public static void main(String[] args){
        try(OutputStreamWriter osr=new OutputStreamWriter(System.out)){
        osr.write(10);  //line break
        osr.write("hello \n");
        osr.write("my name is Mr.Kolleti");

        char[] arr="hello world".toCharArray();
        osr.write(arr);
        
        
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private static void getArr1(OutputStreamWriter osr) throws IOException {
        int[] arr1={1,23,4,5,6};
        osr.write(arr1);
    }
}
