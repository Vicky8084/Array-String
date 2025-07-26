package LinkedList;
class NewNode{
    int data;
    NewNode next;
    public NewNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class AddElementAtBeginning {
    public static NewNode addElementAtBeginning(int data,NewNode head){
        NewNode nn=new NewNode(data);
        nn.next=head;
        head=nn;
        return head;
    }
    public static void printLinkedList(NewNode head){
        NewNode curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void addElementAtLast(int data,NewNode head){
        NewNode curr=head;
        NewNode nn=new NewNode(data);
        while (true){
            if(curr.next==null){
                curr.next=nn;
                break;
            }
            curr=curr.next;
        }

    }
    public static void main(String[] args) {
        NewNode head=new NewNode(1);
        head.next=new NewNode(2);
        head.next.next=new NewNode(5);
        head.next.next.next=new NewNode(8);

        head=addElementAtBeginning(0,head);
        addElementAtLast(12,head);
        printLinkedList(head);
    }
}
