public class circular_linkedlist {
    
    public static node head=null;
    static class node{
        int data;
        node prev;
        node next;
        public node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public static void add_at_beg(int data){
        node newnode=new node(data);
        node temp=head.prev;
        temp.next=newnode;
        newnode.prev=temp;
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }
    public static void add_at_end(int data){
        node newnode=new node(data);
        node temp=head.prev;
        newnode.prev=temp;
        temp.next=newnode;
        newnode.next=head;
    }

    public static void del_at_beg(){
        node temp=head.prev;
        node temp2=head.next;
        temp.next=temp2;
        temp2.prev=temp;
        head=temp2;
    }

    public static void del_at_end(){
        node temp=head.prev;
        node temp2=temp.prev;
        temp2.next=head;
        head.prev=temp2;
    }
    public static void main(String args[]){
        head=new node(10);
        node first=new node(20);
        node second=new node(30);
        head.next=first;
        head.prev=second;
        first.prev=head;
        first.next=second;
        second.prev=first;
        second.next=head;

        add_at_beg(5);
        add_at_end(45);
        del_at_end();

        node temp=head;
        while(head.next!=temp){
            System.out.println(head.data);
            head=head.next;
        }
        System.out.println(head.data);

    }
}
