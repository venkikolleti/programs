public class queue_implementation {
    
    int data[];
    int rear=-1;
    private static final int size=5;
    
    public queue_implementation(int len){
        this.data=new int[len];
    }

    public boolean isFull(){
        return rear==data.length-1;
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        data[++rear]=val;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int ans=data[0];
        for(int i=0;i<=rear;i++){
            data[i]=data[i+1];
        }
        rear--;
        return ans;
    }

    

    public void display(){
        for(int i=0;i<=rear;i++){
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args) {
        queue_implementation q=new queue_implementation(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        //q.enqueue(50);

        q.display();
        System.out.println();
        System.out.println(q.dequeue());
        System.out.println();

        q.display();
    }
}
