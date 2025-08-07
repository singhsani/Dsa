

class Node4{
    int value;
    Node4 left;
    Node4 right;

    public Node4(int val) {
        this.value=val;
        left=null;
        right=null;
    }
    
}

public class HightOfBinaryTree{
 Node4 root;
 public static Node4 addNode4(Node4 cuNode4,int val){
    if(cuNode4 == null){
        return new Node4(val);
    }
    if(cuNode4.value>val){
        cuNode4.left=addNode4(cuNode4.left, val);
    }else{
        cuNode4.right=addNode4(cuNode4.right, val);
    }
    return cuNode4;
 }
 public static int printHightOfTree(Node4 cNode4){
    if(cNode4 == null){
        return -1;
    }
    int lh=printHightOfTree(cNode4.left);
    int rh=printHightOfTree(cNode4.right);
    return Math.max(lh, rh)+1;
 }

 public void addNodes(int val){
    root=addNode4(root, val);
 }

 public static void main(String[] args) {
     HightOfBinaryTree hobt=new HightOfBinaryTree();
     hobt.addNodes(13);
     hobt.addNodes(3);
     hobt.addNodes(4);
     hobt.addNodes(5);
     hobt.addNodes(10);
     hobt.addNodes(6);
     System.out.println(printHightOfTree(hobt.root));
 }
}