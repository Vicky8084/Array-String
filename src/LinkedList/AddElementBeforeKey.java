package LinkedList;
class NodeNew{
    int data;
    NodeNew next;
    public NodeNew(int data){
        this.data=data;
        this.next=null;
    }
}
public class AddElementBeforeKey {
    public static NodeNew addElementBeforeKey(int data,int key,NodeNew head){
        NodeNew nn=new NodeNew(data);
        if(head.data==key){
            nn.next=head;
            head=nn;
            return head;
        }
        NodeNew curr=head,prev=null;
        while (curr.data!=key){
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Key Not Found..!!");
            return head;
        }
        nn.next=curr;
        prev.next=nn;
        return head;
    }
    public static void printLinkedList(NodeNew head){
        NodeNew curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        NodeNew head=new NodeNew(2);
        head.next=new NodeNew(5);
        head.next.next=new NodeNew(7);
        head=addElementBeforeKey(9,7,head);
        printLinkedList(head);
    }
}
