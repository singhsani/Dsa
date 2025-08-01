
class Nodes{
    int value;
    Nodes left,right;
    public Nodes(int val){
        this.left=null;
        this.right=null;
        this.value=val;
    }
}

public class BinaryTree{
     Nodes root;
    public Nodes addNode(Nodes currentNode,int value){
        if(currentNode==null){
            return new Nodes(value);
        }
        if(currentNode.value>value){
            currentNode.left=addNode(currentNode.left, value);
        }else{
            currentNode.right=addNode(currentNode.right, value);
        }
        return currentNode;
    }
    public void add(int val){
        root=addNode(root, val);
    }
    public  void printTreeValue(Nodes node){
        if(node !=null){
           
            printTreeValue(node.right);
             System.out.println(node.value);
             printTreeValue(node.left);
        }
    }
    public static void main(String[] args) {
       BinaryTree bt=new BinaryTree();
       bt.add(6);
       bt.add(7);
       bt.add(8);

       bt.printTreeValue(bt.root);
    }
}

