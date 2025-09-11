package LinkedList;
class Node2{
    int data;
    Node2 next;
    public Node2(int data){
        this.data=data;
        this.next=null;
    }
}
public class AddElementAfterKey {
    public static void addElementAfterKey(int key, Node2 head){
        if(head==null){
            return;
        }
        Node2 curr=head;
        while (curr.data!=key){
            curr=curr.next;
        }
        if(curr==null){
            return;
        }
        Node2 nn=new Node2(curr.data);
        nn.next=curr.next;
        curr.next=nn;
    }
    public static void printLinkedList(Node2 head){
        Node2 curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node2 head=new Node2(2);
        head.next=new Node2(3);
        head.next.next=new Node2(5);
        addElementAfterKey(7,head);
        printLinkedList(head);
    }
}
