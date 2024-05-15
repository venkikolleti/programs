//148 leetcode

//https://leetcode.com/problems/sort-list/

public class sorted_linkedlist {

    public static LL.node sort(LL.node head){
        LL.node f=head;
        LL.node s=head;
        while(f!=null){
            s=f.next;
            while(s!=null){
                if(f.data>s.data){
                    int temp=s.data;
                    s.data=f.data;
                    f.data=temp;
                }
                s=s.next;
            }
            f=f.next;
        }
        return head;
    }

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

    public static LL.node merge_sort(LL.node head){
        if(head==null && head.next==null){
            return head;
        }
        LL.node mid=middle(head);
        LL.node left=merge_sort(head);
        LL.node right=merge_sort(mid);

        return mer(left,right);
    }

    public static LL.node mer(LL.node list1,LL.node list2){
        LL.node dummyhead=new LL.node();
        LL.node tail=dummyhead;

        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        tail.next=(list1!=null)?list1:list2;
        return dummyhead.next;
    }


    public static void main(String[] args) {
        LL ll=new LL();
        ll.add_at_beg(10);
        ll.add_at_beg(20);
        ll.add_at_beg(30);
        ll.add_at_beg(40);
        ll.add_at_beg(50);

        //ll.display();
        System.out.println(merge_sort(ll.head));
        //LL.node ans=sort(ll.head);
        //System.out.println(ans.data);
        ll.display();
    }
}
