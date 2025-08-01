
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
    public static void main(String[] args) {
        PrintBinaryTreeInPreOrder pbtipo=new PrintBinaryTreeInPreOrder();
        
    }

}