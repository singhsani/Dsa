

class Node1{
    int value;
    Node1 left;
    Node1 right;
    Node1(int val){
        left=null;
        right=null;
        this.value=val;
    }
}
public class FindElementInBinaryTree{
    Node1 root;
    public Node1 addNode(Node1 currentNode,int val){
        if(currentNode == null){
            return new Node1(val);
        }
        if(val<currentNode.value){
            currentNode.left=addNode(currentNode.left, val);
        }else{
            currentNode.right=addNode(currentNode.right,val);
        }
        return currentNode;
    }
    public static boolean findValue(Node1 cuNode1,int value){
        if(cuNode1 == null){
            return false;
        }
        if(cuNode1.value== value){
            return true;
        }
        return value<cuNode1.value? findValue(cuNode1.left, value):findValue(cuNode1.right, value);
    }
    public void addElementInTree(int val){
        root=addNode(root, val);
    }
    private void printData(Node1 node){
        if(node !=null){
            
            System.out.println(node.value);
            printData(node.right);
            printData(node.left);
        }
    }
    public static void main(String[] args) {
        FindElementInBinaryTree feibt=new FindElementInBinaryTree();
        feibt.addElementInTree(8);
        feibt.addElementInTree(2);
        feibt.addElementInTree(18);
         feibt.addElementInTree(28);
        feibt.addElementInTree(20);
        feibt.addElementInTree(14);
         feibt.addElementInTree(12);
        feibt.addElementInTree(22);
        feibt.addElementInTree(10);
        
        String massage=findValue(feibt.root, 10)?"Data Found":"data Not Found";
        System.out.println(""+ massage);
        feibt.printData(feibt.root);
        
    }
}