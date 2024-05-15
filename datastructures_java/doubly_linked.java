import java.util.Scanner;

public class doubly_linked {
    public static node head=null,temp=null,temp2=null;

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

    public static void add_at_end(int data){
        node newnode=new node(data);
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }


    public static void add_at_par(int data){
        node newnode=new node(data);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  position: ");
        int n=sc.nextInt();
        temp=head;
        for(int i=1;i<n-1;i++){
            temp=temp.next;
        }
        temp2=temp.next;
        temp.next=newnode;
        temp2.prev=newnode;
        newnode.prev=temp;
        newnode.next=temp2;
    }





    public static void del_at_beg(){
        head=head.next;
        head.prev=null;
    }

    public static void del_at_end(){
        temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;

    }

    public static void del_at_par(){
        temp=head;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the position: ");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            temp=temp.next;
        }
        temp2=temp.prev;
        temp2.next=temp.next;
        temp.next.prev=temp2;

    }


    public static void main(String args[]){
        head=new node(10);
        node first=new node(20);
        node second=new node(30);
        
        head.next=first;
        first.prev=head;
        first.next=second;
        second.prev=first;

        add_at_beg(5);
        add_at_end(40);
        add_at_par(25);

        //del_at_beg();
        //del_at_end();
        del_at_par();

        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
