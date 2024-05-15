package generics_exceptions;
import java.util.ArrayList;

public class lambda_expression {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<6;i++){
            list.add(i+1);
        }

        list.forEach((item)->System.out.print(item*3+"\t")); //lambda expression
        System.out.println();

    }
}
