public class doubly_linkedlist {
    
    public static node head=null;
    public static class node{
        int data;
        node prev;
        node next;
        node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public static void add_at_beg(int data){
        node newnode=new node(data);
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }
    public static void main(String[] args) {
        head=new node(10);
        node first=new node(20);
        node second=new node(30);
        
        head.next=first;
        first.prev=head;
        first.next=second;
        second.prev=first;

        add_at_beg(40);
        add_at_beg(50);
        add_at_beg(60);

        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
