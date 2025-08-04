class Node3{
    int value;
    Node3 left;
    Node3 right;
    public Node3(int val) {
        this.value=val;
        this.left=null;
        this.right=null;
    }
}

public class PrintBinaryTreeInPostOrder{
    public Node3 addNode3(Node3 cuNode3,int val){
        if(cuNode3 == null){
            return new Node3(val);
        }
        if(cuNode3.value>val){
            cuNode3.left=addNode3(cuNode3.left, val);
        }else{
            cuNode3.right=addNode3(cuNode3.right, val);
        }
        return cuNode3;
    }
}