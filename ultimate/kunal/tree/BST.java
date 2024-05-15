public class BST {
    public BST(){
        
    }

    public static void main(String[] args) {
        BST tree=new BST();
        int[] nums={10,20,15,32,54,67,23,54,3,7,5};
        int[] nums1={1,2,3,4,5,6,7,8,9,10};
        int[] nums2={15,10,18,7,12,16,20};
        tree.insertion(nums2);

        tree.display(root, "root");

        System.out.println();
        
        System.out.println("preorder traversal:");
        tree.preorder(root);
        System.out.println();
        
        System.out.println("Inorder traversal:");
        tree.Inorder(root);
        System.out.println();

        System.out.println("postorder traversal:");
        tree.postorder(root);
        System.out.println();
    }
    
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value=value;
        }

        public int getvalue(){
            return value;
        }
    }

    public static Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }

    private Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void insertion(int[] nums){
        for(int i=0;i<nums.length;i++){
            root=insert(nums[i],root);
        }
    }

    public void insertionForSorted(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        root=insert(nums[mid],root);
        insertionForSorted(nums, start,mid);
        insertionForSorted(nums, mid+1,end);

    }
    public void display(){
        display(root,"root");
    }

    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"Left child of "+node.value+": ");
        display(node.right,"Right child of "+node.value+": ");

    }
    public void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public void Inorder(Node node){
        if(node==null){
            return;
        }
        Inorder(node.left);
        System.out.print(node.value+" ");
        Inorder(node.right);
    }

    public void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value+" ");

    }



}
