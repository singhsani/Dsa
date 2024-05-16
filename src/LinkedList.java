class Node{
    int data;
    Node next=null;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class LinkedList {
    Node head;
    public static LinkedList insert(LinkedList linkedList,int data){
        Node newNode=new Node(data);
        if(linkedList.head==null){
            linkedList.head=newNode;
        }else{
            Node lastNode=linkedList.head;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
        return linkedList;
    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        insert(linkedList,4);
        insert(linkedList,4);
        insert(linkedList,4);
        insert(linkedList,4);
        insert(linkedList,4);
        printList(linkedList.head);


    }

    private static void printList(Node head) {
        if(head==null)
            return;
        System.out.print(head.data+" ");
        printList(head.next);
    }
}
