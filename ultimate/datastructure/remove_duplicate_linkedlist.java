//sorted list

//83 leetcode



public class remove_duplicate_linkedlist {
    public static node head=null;
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
        public node(int data,node next){
            this.data=data;
            this.next=next;
        }
    }

    public static void add_at_beg(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }

    public static void remove_duplicate(){
        node temp=head;
        while(temp.next!=null){
            if(temp.next!=null && temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }

    public static void display(node head){
        if(head==null){
            return;
        }
        System.out.println(head.data);
        display(head.next);
    }
    
    public static void main(String[] args) {
        head=new node(10);
        add_at_beg(10);
        add_at_beg(10);
        add_at_beg(20);
        add_at_beg(30);
        add_at_beg(30);

        node temp2=head;
        node temp3=head;

        //display(temp2);
        remove_duplicate();
        display(temp3);

        

    }
}
