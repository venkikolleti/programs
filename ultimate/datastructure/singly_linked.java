public class singly_linked {
    
    public static node head=null;
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void add_at_beg(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }

    public static void add_at_end(int data){
        node nextnode=new node(data);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=nextnode;
    }

    public static void add_at_pos(int data,int pos){
        node newnode=new node(data);
        node temp=head;
        node temp2=head.next;
        int x=1;
        while(pos!=x++){
            temp=temp2;
            temp2=temp2.next;
        }
        temp.next=newnode;
        newnode.next=temp2;
    }
    public static void main(String args[]){
        head=new node(10);
        node first=new node(20);
        node second=new node(30);
        head.next=first;
        first.next=second;

        add_at_beg(5);
        add_at_end(45);
        add_at_pos(25,2);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }
}
