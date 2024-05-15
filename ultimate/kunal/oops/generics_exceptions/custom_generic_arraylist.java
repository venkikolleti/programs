package generics_exceptions;


import java.util.Arrays;

public class custom_generic_arraylist<T> {
    
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    public custom_generic_arraylist(){
        data =new Object[DEFAULT_SIZE];
    }
    public void add(T val){
        if(isfull()){
            resize();
        }
        data[size++]=val;
    }
    private void resize() {
        Object[] temp=new Object[DEFAULT_SIZE*2];

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }


    private boolean isfull() {
        return size==data.length;
    }

    public T remove(){
        T removed=(T)(data[--size]);
        data[size]=null;
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index,T val){
        data[index]=val;
    }
    

    @Override
    public String toString() {
        return "custom_generic_arraylist [data=" + Arrays.toString(data) + ", size=" + size + "]";
    }
    public static void main(String[] args) {
        custom_generic_arraylist<Integer> list=new custom_generic_arraylist<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.remove();
        System.out.println(list);

        System.out.println(list.size());

        list.set(1,100);
        System.out.println(list.get(1));

        System.out.println(list);


        

    }
}
