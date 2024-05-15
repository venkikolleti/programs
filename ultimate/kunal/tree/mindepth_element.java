import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class mindepth_element {
    public static void main(String[] args) {
        bst_practice bt=new bst_practice();
        int[] nums={2,6,9,4,6,8,66,22};
        bt.insertion(nums);
        bt.display(); 
        System.out.println(mindepth(bt.root));
    }

    public static int mindepth(Node node){
       Queue<bst_practice.Node> order=new LinkedList<>();
       order.offer(node);
       int count=1;

       while(!order.isEmpty()){
            Node newnode=order.poll();
            int levelsize=order.size();
            for(int i=0;i<levelsize;i++){
                if(newnode.left==null || newnode.right==null){
                    return count;
                }
                else{
                    order.offer(newnode.left);
                    order.offer(newnode.right);
                }
                count++;
            }
       }
       return count;
    }
}
