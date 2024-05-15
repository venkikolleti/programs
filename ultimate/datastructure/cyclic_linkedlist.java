//141 leetcode

public class cyclic_linkedlist {

    public static node head;
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }

    public static boolean cyclic(){
        node fast=head;
        node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;

    }
    public static int length_cycle(){
        node fast=head;
        node slow=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                do{
                    slow=slow.next;
                    length+=1;
                }while(slow!=fast);
                return length;
            }
        }
        return length;
    }



    public static node cyclic_node(){
        node f=head;
        node s=head;
        int length=length_cycle();

        while(length>0){
            s=s.next;
            length--;
        }

        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    public static void main(String[] args) {
        head=new node(10);
        node first=new node(20);
        node second=new node(30);
        node third=new node(40);
        node four=new node(50);
        node five=new node(60);
        node six=new node(70);
        node seven=new node(80);


        head.next=first;
        first.next=second;
        second.next=third;
        third.next=four;
        four.next=five;
        five.next=six;
        six.next=seven;
        seven.next=six;


        System.out.println(length_cycle());
        if(cyclic()){
            System.out.println("cycle is presented");
        }
        else{
            System.out.println(" Cycle is not presented");
        }


        node ans=cyclic_node();
        System.out.println(ans.data);
        

    }
}
