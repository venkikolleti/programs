import java.util.Scanner;

class stack{
    static node top=null;
    static class node{
        int data;
        node link;

        public node(int data){
            this.data=data;
            this.link=link;
        }
    }

    void push(){
        System.out.print("enter data: ");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        node newnode=new node(data);

        if(top==null){
            top=newnode;
        }
        else{
            newnode.link=top;
            top=newnode;

        }
    }


    void display(){
        System.out.println("stack elements");
        node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.link;
        }
    }
}


public class stack_linked {
    
    public static void main(String args[]){

        stack s=new stack();
        s.push();
        s.push();
        s.push();

        s.display();

    }
}
