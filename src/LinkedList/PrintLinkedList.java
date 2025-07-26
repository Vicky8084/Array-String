package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class PrintLinkedList {


    //this method is used to print the whole Linked List
    public static void printLinkedList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.print("null");
    }


    //This method is used to add the element in the beginning
    public static Node addElement(int val,Node head){
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        return head;
    }


    //This method is used to add Element in the last
    public static void addElementAtLast(int data,Node head){
        Node nn=new Node(data);
        Node curr=head;
//        while (true){
//            if(curr.next==null){
//                curr.next=nn;
//                break;
//            }
//            curr=curr.next;
//        }

//          or

        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
    }

    public static void addAfter(int data, Node head,int k){
        Node curr=head;
        Node nn=new Node(data);
//        while(true){
//            if(curr.data==k){
//                Node temp=curr.next;
//                curr.next=nn;
//                nn.next=temp;
//                break;
//            }
//            curr=curr.next;
//        }
        while(curr.data!=k){
            curr=curr.next;
        }
        nn.next=curr.next;
        curr.next=nn;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head=addElement(5,head);
        addElementAtLast(45,head);
        addAfter(9,head,5);
        printLinkedList(head);
    }
}
