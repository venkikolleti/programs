import java.util.Scanner;

public class singly_linked_del {
    public static node head=null;
    static class node{
        int data;
        node prev;
        node next;
        node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    static void del_at_beg(){
        head=head.next;
       
    }

    static void del_at_end(){
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;       
    }

    static void del_at_par(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the pos: ");
        int n=sc.nextInt();
        node temp=head;
        /*int i=1;
        while(i<n-1){
            temp=temp.next;
        }
        node temp2=temp.next;
        temp.next=temp2.next;*/
        node temp2=temp.next;
        for(int i=1;i<n-1;i++){
            temp=temp.next;
            temp2=temp2.next;
        }
        temp.next=temp2.next;



    }
    public static void main(String args[]){
        head=new node(10);
        node first=new node(20);
        node second=new node(30);
        node third=new node(40);

        head.next=first;
        first.next=second;
        second.next=third;

        
        //del_at_beg();
        //del_at_end();
        del_at_par();


        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }

}
