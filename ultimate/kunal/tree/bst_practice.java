public class bst_practice {
    public static void main(String[] args) {
        bst_practice bt=new bst_practice();
        int[] nums={3,4,6,1,3,9,5};
        int[] nums1={1,2,3,4,5,6,7};
        bt.insertion(nums1);
        bt.display();
        System.out.println("height of the tree is: "+height(root));

    }

    private static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static Node root;

    public void insert(int val){
        root=insert(val,root);
    }
    private Node insert(int val,Node node){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(val<node.val){
            node.left=insert(val,node.left);
        }
        if(val>node.val){
            node.right=insert(val,node.right);
        }
        return node;
    }

    public void insertion(int[] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }

    
    public void display(){
        display(root,"root");
    }

    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.val);
        display(node.left,"left of "+node.val+" is: ");
        display(node.right,"right of "+node.val+" is: ");

    }

    public static int height(Node node){
        if(node==null){
            return 0;
        }
        int left=height(node.left);
        int right=height(node.right);
        return Math.max(left,right)+1;
    }

}
