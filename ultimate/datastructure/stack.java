public class stack {

    public static stack1 top=null;
    public static class stack1{
        int data;
        stack1 next;
        public stack1(int data){
            this.data=data;
            this.next=null;
        }
    }

    static void push(int data){
        stack1 newtop=new stack1(data);
        newtop.next=top;
        top=newtop;
    }

    static void pop(){
        top=top.next;
    }
    static void peek(){
        System.out.println("peek element is: "+top.data);
    }
    public static void main(String[] args) {
        top=new stack1(10);
        stack1 first=new stack1(20);
        stack1 second=new stack1(30);
        first.next=top;
        second.next=first;
        top=second;
        
        push(40);
        push(50);
        pop();

        peek();
        while(top!=null){
            System.out.println(top.data);
            top=top.next;
        }

    }
}
