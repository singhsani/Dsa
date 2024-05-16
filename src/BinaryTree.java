import java.util.Scanner;

class BinaryNode{
    int data;
    BinaryNode left;
    BinaryNode right;
    BinaryNode(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class BinaryTree {
   static Scanner sc=new Scanner(System.in);
   public static BinaryNode addNode(){
       BinaryNode root=null;
       int data=BinaryTree.sc.nextInt();
       if(data==-1){
           return null;
       }
      root=new BinaryNode(data);
       root.left=addNode();
       root.right=addNode();
       return root;
   }
}
