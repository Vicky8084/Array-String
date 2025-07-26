package LinkedList;

class Node3{
    int data;
    Node3 next;
    public Node3(int data){
        this.data=data;
        this.next=null;
    }
}

public class AddElementAtAnyPosition {
    public static Node3 addElementAtAnyPosition(int pos,int data,Node3 head){
        Node3 nn=new Node3(data);
        if(pos==1){
            nn.next=head;
            head=nn;
            return head;
        }
        Node3 curr=head;
        for(int i=1;i<pos-1;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        nn.next=curr.next;
        curr.next=nn;
        return head;
    }
    public static void printLinkedlist(Node3 head){
        Node3 curr=head;
        while (curr!=null) {
            System.out.print(curr.data + "-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node3 head=new Node3(1);
        head.next=new Node3(4);
        head.next.next=new Node3(6);
        head.next.next.next=new Node3(3);
        head=addElementAtAnyPosition(1,5,head);
        head=addElementAtAnyPosition(7,25,head);
        head=addElementAtAnyPosition(3,15,head);
        head=addElementAtAnyPosition(6,15,head);
        printLinkedlist(head);
    }
}
