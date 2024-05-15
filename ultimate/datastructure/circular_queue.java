public class circular_queue {
    
    public int data[];

    public int rear=-1,front=-1;
    public circular_queue(int len){
        this.data=new int[len];
    }

    public void enqueue(int val){
        if(front==-1 && rear==-1){
            front++;
            rear++;
            data[rear]=val;
            return;     
        }
        if((rear+1)%data.length==front){
            System.out.println("queue is full");
            return;
        }
        rear=(rear+1)%data.length;
        data[rear]=val;
    }

    public void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("queue is empty");
        }
        else if(front==rear){
            System.out.println(data[front]);
            front=rear=-1;
        }
        else{
            System.out.println(data[front]);
            front=(front+1)%data.length;
        }
    }

    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(data[i]);
        }
    }
        
    
    public static void main(String[] args) {
        circular_queue c=new circular_queue(5);
        c.dequeue();
        System.out.println();
        
        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);
        c.enqueue(40);
        c.enqueue(50);
        //c.enqueue(60);

        c.dequeue();
        c.dequeue();
        c.dequeue();
        //c.dequeue();
        //c.dequeue();
        //c.dequeue();

        System.out.println();
        c.display();
    }
}
