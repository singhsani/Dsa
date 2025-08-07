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
    Node3 root;
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
    public void addNodeS(int val){
        root=addNode3(root, val);
    }
    public static void printPostOrder(Node3 cuNode3){
        if(cuNode3 !=null){
            printPostOrder(cuNode3.left);
            printPostOrder(cuNode3.right);
            System.out.println(cuNode3.value);
        }
    }
    public static void main(String[] args) {
        PrintBinaryTreeInPostOrder pbtipo=new PrintBinaryTreeInPostOrder();
        pbtipo.addNodeS(5);
        pbtipo.addNodeS(9);
        pbtipo.addNodeS(12);
        pbtipo.addNodeS(11);
        pbtipo.addNodeS(10);
        pbtipo.addNodeS(13);
        printPostOrder(pbtipo.root);
    }
}