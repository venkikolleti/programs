import java.util.*;

public class BFS {
    public static void main(String[] args) {
        BFS bt=new BFS();
        int[] nums={10,4,12,7,23,9,3,15,34,5};
        bt.insertion(nums);
        bt.display();
        level();
        System.out.println(ans);
        System.out.println(TraverLevel(root));
        //System.out.println(order);
        //System.out.println(index);
        //System.out.println(root.val);

    }

    static List<Integer> ans=new ArrayList<>();
    static List<Node> order=new ArrayList<>();
    static int index=0;
    public static void level(){
        levelTraverse(root);
    }
    public static void levelTraverse(Node node){
        if(node==null){
            return;
        }
        ans.add(node.val);
        order.add(node.left);
        order.add(node.right);
        while(index!=order.size()){
            levelTraverse(order.get(index++));
        }

    }




    //level traversal and return elements by level and level as list

    public static List<List<Integer>> TraverLevel(Node node){
        List<List<Integer>> result=new ArrayList<>();

        if(node==null){
            return result;
        }
        Queue<Node> ord=new LinkedList<>();
        ord.add(node);

        while(!ord.isEmpty()){
            List<Integer> currentLevel=new ArrayList<>();
            int levelNode=ord.size();
            for(int i=0;i<levelNode;i++){
                Node currentNode=ord.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left!=null){
                    ord.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    ord.add(currentNode.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }


    private static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    private static Node root;

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
}
