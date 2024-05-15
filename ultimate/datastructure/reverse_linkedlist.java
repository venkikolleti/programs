public class reverse_linkedlist {
    public static node head=null;
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        head=new node(10);
        node first=new node(20);
        node second=new node(30);
        node third=new node(40);
        node four=new node(50);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=four;

        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        node head2=null;
        node temp2=head;
        while(temp2!=null){
            node link=temp2.next;
            temp2.next=head2;
            head2=temp2;
            temp2=link;
        }

        while(head2!=null){
            System.out.println(head2.data);
            head2=head2.next;
        }

       

    }
}
