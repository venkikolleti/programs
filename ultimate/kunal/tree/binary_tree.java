import java.util.Scanner;

public class binary_tree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        binary_tree tree=new binary_tree();
        tree.insert(sc);
        tree.display(root," ");
        //1tree.betterDisplay();
        tree.prettyDisplay();
    }

    private static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data=data;
        }
    }

    private static node root;

    public void insert(Scanner sc){
        System.out.println("ENter the root node: ");
        int data=sc.nextInt();
        root=new node(data);
        insert(sc,root);
    }
    private void insert(Scanner sc,node nod){
        System.out.println("Do you want enter the left node: "+nod.data);
        boolean left=sc.nextBoolean();
        if(left){
            System.out.println("Enter the left node value for: "+nod.data);
            int data=sc.nextInt();
            nod.left=new node(data);
            insert(sc,nod.left);
        }
        System.out.println("Do You want enter the right of node: "+nod.data);
        boolean right=sc.nextBoolean();
        if(right){
            System.out.println("Enter the value for the right node: "+nod.data);
            int data=sc.nextInt();
            nod.right=new node(data);
            insert(sc,nod.right);
        }

    }


    public void display(node temp,String indent){
        if(temp==null){
            return;
        }
        System.out.println(indent+temp.data);
        display(temp.left,indent+"\tleft");
        display(temp.right,indent+"\tright");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
      }
    
      private void prettyDisplay(node node, int level) {
        if (node == null) {
          return;
        }
    
        prettyDisplay(node.right, level + 1);
    
        if (level != 0) {
          for (int i = 0; i < level - 1; i++) {
            System.out.print("|\t");
          }
          System.out.println("|------->" + node.data);
        } else {
          System.out.println(node.data);
        }
        prettyDisplay(node.left, level + 1);
      }

    /*public void betterDisplay(){
        betterDisplay(root, 0);
    }
    public void betterDisplay(node temp,int level){
        if(temp==null){
            return;
        }
        betterDisplay(temp.right, level+1);
        if(level!=0){
            for(int k=0;k<level-1;k++){
                System.out.println("\t\t");
            }
            System.out.println("|-------->"+temp.data);
        }
        else{
            System.out.println(temp.data);
        }

        betterDisplay(temp.left, level+1);
    }*/

    public void preorder(node node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }

    public void Inorder(node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        System.out.println(node.data);
        preorder(node.right);
    }

    public void postorder(node node){
        if(node==null){
            return;
        }
        preorder(node.left);
        preorder(node.right);
        System.out.println(node.data);

    }

}
