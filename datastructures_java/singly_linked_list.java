import java.util.LinkedList;
import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class singly_linked_list {

    public static node head=null;
    static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    

    node add_at_beg(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
        return head;
    }

    node add_at_end(int data){
        node newnode=new node(data);
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;        
    }
    node add_at_pos(int data){
        node newnode=new node(data);
        node temp=head;
        System.out.println("enter the position");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<n-1){
            temp=temp.next;
            i++;
        }
        node temp2=temp.next;
        temp.next=newnode;
        newnode.next=temp2;

        return head;

    }

    public static void main(String args[]){
        /*LinkedList list=new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list);*/

        head=new node(1);
        node first=new node(2);
        node second=new node(3);

        

        head.next=first;
        first.next=second;


        singly_linked_list ll=new singly_linked_list();
        head=ll.add_at_beg(15);
        head=ll.add_at_end(100);
        head=ll.add_at_pos(200);



        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }



    }
}
