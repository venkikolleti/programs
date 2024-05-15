//876 leetcode
//https://leetcode.com/problems/middle-of-the-linked-list/

public class middle_linkedlist {

    public static LL.node middle(LL.node head){
        LL.node f=head;
        LL.node s=head;

        while(s.next!=null){
            f=f.next;
            if(s.next.next==null){
                return f;
            }
            s=s.next.next;
        }
        return f;

    }
    public static void main(String[] args) {
        LL ll=new LL();
        ll.add_at_beg(10);
        ll.add_at_end(20);
        ll.add_at_end(30);
        ll.add_at_end(40);
        ll.add_at_end(50);
        ll.add_at_end(60);
        ll.add_at_end(70);
        ll.add_at_end(80);


        //ll.display();

        LL.node ans=middle(ll.head);

        System.out.println(ans.data);




    }
}
