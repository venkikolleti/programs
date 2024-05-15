//21 leetcode

public class merge_sort_linked {

    public static LL merge(LL first,LL second){
        LL.node f=first.head;
        LL.node s=second.head;
        
        LL ans=new LL();
        ans.add_at_beg(100);
        //ans.add_at_end(10);

        while(f!=null && s!=null){
            if(f.data<s.data){
                ans.add_at_end(f.data);
                f=f.next;
            }
            else{
                ans.add_at_end(s.data);
                s=s.next;
            }
        }

        while(f!=null){
            ans.add_at_end(f.data);
            f=f.next;
        }
        while(s!=null){
            ans.add_at_end(s.data);
            s=s.next;
        }
        return ans;

    }
    public static void main(String[] args) {
        LL ll=new LL();
        ll.add_at_beg(40);
        ll.add_at_beg(30);
        ll.add_at_beg(20);
        ll.add_at_beg(10);

        //ll.display();

        System.out.println();

        LL ll1=new LL();
        ll1.add_at_beg(44);
        ll1.add_at_beg(33);
        ll1.add_at_beg(22);
        ll1.add_at_beg(11);


        //ll1.display();

        LL ans=merge(ll,ll1);

        ans.display();

    }
}
