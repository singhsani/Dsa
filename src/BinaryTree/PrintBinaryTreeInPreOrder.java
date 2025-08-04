
class Node2{
    int value;
    Node2 left;
    Node2 right;
    public Node2(int val) {
        left=null;
        right=null;
        this.value=val;
    }
    
}

public class PrintBinaryTreeInPreOrder{
    Node2 root;
    public static Node2 addNode2(Node2 cuNode2,int val){
        if(cuNode2 == null){
            return new Node2(val);
        }
        if(val<cuNode2.value){
            cuNode2.left=addNode2(cuNode2.left, val);
        }else{
            cuNode2.right=addNode2(cuNode2.right, val);
        }
        return cuNode2;
    }
    public void addDataInTree(int val){
        root=addNode2(root, val);
    }
    public static void printInPreOrder(Node2 cuNode2){
        if(cuNode2 !=null){
            System.out.println(cuNode2.value);
            printInPreOrder(cuNode2.left);
            printInPreOrder(cuNode2.right);
            
        }
    }
    public static void main(String[] args) {
        PrintBinaryTreeInPreOrder pbtipo=new PrintBinaryTreeInPreOrder();
        pbtipo.addDataInTree(12);
        pbtipo.addDataInTree(6);
        pbtipo.addDataInTree(2);
        pbtipo.addDataInTree(20);
        pbtipo.addDataInTree(13);
        pbtipo.addDataInTree(16);
        printInPreOrder(pbtipo.root);
    }

}