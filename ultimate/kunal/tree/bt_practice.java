import java.util.Scanner;

public class bt_practice {

    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        }
    }

    public static Node root;
    public static Scanner sc=new Scanner(System.in);
    public void insert(){
        System.out.println("Enter the root node");
        int data=sc.nextInt();
        root=new Node(data);
        insert(root);
    }
    public void insert(Node node){
        System.out.println("Enter the left node value of "+node.data+" if there is no left node enter 0: ");
        int data=sc.nextInt();
        if(data!=0){
            node.left=new Node(data);
            insert(node.left);
        }

        System.out.println("Enter the right node value of "+node.data+" if there is no right node enter 0: ");
        int d=sc.nextInt();
        if(d!=0){
            node.right=new Node(d);
            insert(node.right);
        }
    }


    public void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.data);
        display(node.left,"Left node of "+node.data+": ");
        display(node.right,"Right node of "+node.data+": ");

    }
    public static void main(String[] args) {
        bt_practice bt=new bt_practice();
        bt.insert();
        bt.display(root,"root");
    }
}


