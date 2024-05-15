package generics_exceptions;
import java.util.Arrays;

public class customArraylist {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    customArraylist(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isfull()){
            resize();
        }
        data[size++]=num;
    }
    private void resize() {
        int[] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isfull() {
        return size==data.length;
    }
    


    public int remove(){
        int removed=data[--size];
        data[size]=0;
        return removed;
    }

    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index,int num){
        data[index]=num;
    }


    @Override
    public String toString() {
        return "customArraylist [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }

    public static void main(String[] args) {
        customArraylist cum=new customArraylist();
        cum.add(19);
        cum.add(30);
        cum.add(40);
        for(int i=0;i<cum.size();i++){
            System.out.println(cum.get(i));
        }


        System.out.println(cum);

        System.out.println(cum.remove());

        for(int i=10;i<20;i++){
            cum.add(i);
        }

        cum.set(0,100);


        System.out.println(cum);
        cum.remove();
        System.out.println(cum);
    }
}
