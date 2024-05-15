import java.util.Scanner;

class queue{
    int front=-1,rear=-1;
    int max=5;
    int queue[]=new int[max];

    void enqueue(){

        Scanner sc=new Scanner(System.in);
        System.out.print("enter: ");
        int data=sc.nextInt();
        if(rear==max-1){
            System.out.println("queue is overflow");
        }
        else if(rear==-1 && front==-1){
            rear=front=0;
            queue[rear]=data;

        }
        else{
            rear=rear+1;
            queue[rear]=data;
        }       
    }




    void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("queue underflow");
        }
        else{
            System.out.println("dequeue element"+queue[front]);
            front=front+1;
        }
    }



    void display(){
        System.out.println("queue elements are: ");
        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
    }


}

public class queue_Array {

    public static void main(String args[]){
        queue q=new queue();
        q.enqueue();
        q.enqueue();
        q.enqueue();
        q.display();
        q.dequeue();
        q.display();
    }
    
}
