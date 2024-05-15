public class stack_implementation {

    int[] data;
    int top=-1;
    public static final int size=10;

    public stack_implementation(){
        this(size);
    }
    public stack_implementation(int len){
        this.data=new int[len];
    }

    public boolean isFull(){
        return top==data.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        data[++top]=val;
    }

    public void dynamic_push(int val){
        if(isFull()){
            int[] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++)
                temp[i]=data[i];

            data=temp;
        }
        data[++top]=val;
    }

    public int pop(){
        if(isEmpty()){
            System.out.print("Stack is empty ");
            return -1;
        }
        return data[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.print("Stack is empty ");
            return -1;
        }
        return data[top];
    }


    public void display(){
        while(!isEmpty()){
            System.out.println(pop());
        }
    }
    public static void main(String[] args) {
        stack_implementation s=new stack_implementation(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.dynamic_push(40);
        s.push(50);
        s.push(60);
        s.dynamic_push(70); 


        s.display();
        //System.out.println(s.peek());
    }
}
