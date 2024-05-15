public class isvalidBST {
    public static void main(String[] args) {
        BST tree=new BST();
        int[] nums2={15,10,18,7,12,16,20};
        tree.insertion(nums2);

        tree.display();

    }

    public boolean isvalid(Node node){
        if(node==null){
            return false;
        }

        isvalid(node.left);
        isvalid(node.right);

        return true;
    }
}
