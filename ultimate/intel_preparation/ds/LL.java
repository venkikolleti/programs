public class LL {
    public static void main(String[] args) {
        add_at_beg(10);
        add_at_beg(5);
        add_at_end(15);
        add_at_end(20);
        add_at_end(30);
        add_at_end(40);
        add_at_beg(4);

        display();

        //reverseList(head);

        middle(head);
    }
    public static node head=null;
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }
    public static void add_at_beg(int data){
        node temp=new node(data);
        temp.next=head;
        head=temp;
    }
    public static void add_at_end(int data){
        node temp=new node(data);
        node temp2=head;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=temp;
    }
    public static void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.println();
    } 

    public static void reverseList(node temp){
        node head2=null;
        while(temp!=null){
            node newnode=temp.next;
            temp.next=head2;
            head2=temp;
            temp=newnode;
        }
        System.out.println();
        
        while(head2!=null){
            System.out.print(head2.data+" ->");
            head2=head2.next;
        }
        System.out.println();
    }

    public static void middle(node temp){
        node newnode =temp;
        while(newnode.next!=null && newnode.next.next!= null ){
            temp=temp.next;
            newnode=newnode.next.next;
        }
        System.out.println(temp.data);
    }

}
