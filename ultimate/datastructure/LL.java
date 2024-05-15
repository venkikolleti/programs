public class LL {
    public node head;

    public class node{
         int data;
         node next;
         public node(){

         }
        public node(int data){
            this.data=data;
        }
        public node(int data,node next){
            this.data=data;
            this.next=next;
        }
    }

    public void add_at_beg(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }

    public void add_at_end(int data){
        node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        node newnode=new node(data);
        temp.next=newnode;
    }

    public void display(){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

}
