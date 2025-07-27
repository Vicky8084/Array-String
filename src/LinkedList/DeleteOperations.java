package LinkedList;

class Node4{
    int data;
    Node4 next;
    public Node4(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteOperations {

    //Method to delete first Node......
    public static Node4 deleteFirstNode(Node4 head){
        head=head.next;
        return head;
    }


    //Method to delete last Node........
    public static void deleteLastNode(Node4 head){
        Node4 curr=head,prev=null;
        while (curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
    }


    //method to delete node before a key.........
    public static Node4 deleteNodeBeforeKey(int key,Node4 head){
        if(head==null || head.next==null){
            return head;
        }
        if(head.next.data==key){
            head=head.next;
            return head;
        }
        Node4 prevPrev=null,prev=head,curr=head.next;
        while (curr!=null && curr.data!=key ){
            prevPrev=prev;
            prev=curr;
            curr=curr.next;
        }
        if (curr == null) {
            return head;
        }
        if (prevPrev != null) {
            prevPrev.next = curr;
        }
        return head;
//         if(head.next==null || head ==null){
//            return head;
//        }
//        if(head.next.data==key){
//            head=head.next;
//        }
//        Node4 prevPrev=null;
//        Node4 prev=head;
//        Node4 curr=head.next;
//        while (curr!=null && curr.data!=key){
//            prevPrev=prev;
//            prev=curr;
//            curr=curr.next;
//        }
//        if(curr==null){
//            return head;
//        }
//        if(prevPrev!=null){
//            prevPrev.next=curr;
//        }
//        return  head;
    }

    //Method to delete node after key......
    public static void deleteNodeAfterKey(int key,Node4 head){
        if(head==null || head.next==null){
            return;
        }
        Node4 curr=head;
        while (curr.data!=key && curr.next!=null){
            curr=curr.next;
        }
        if(curr.next==null){
            return;
        }
        curr.next=curr.next.next;
    }


    // Delete Node position wise........
    public static Node4 deleteNodePositionWise(int pos,Node4 head){
        Node4 curr= head;

        if(pos==1){
            head=head.next;
            return head;
        }
        for(int i=1;i<pos-1;i++){
            if(curr==null||curr.next==null){
                return head;
            }
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }



//  remove nth node from end.............

    public static Node4 removeNthFromEnd(Node4 head, int n) {
        int size=0;
        Node4 curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        int pos=size-n;
        System.out.println(size+".."+pos);
        if(pos==1){
            head=head.next;
            return head;
        }
        for(int i=1;i<pos;i++){
            if(curr==null || curr.next==null){
                return head;
            }
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }



    //Method to Print LinkedList.........
    public static void printLinedList(Node4 head){
        Node4 curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Node4 head=new Node4(1);
        head.next=new Node4(2);
        head.next.next=new Node4(3);
        head.next.next.next=new Node4(4);
        head.next.next.next.next=new Node4(5);
        head.next.next.next.next.next=new Node4(6);
        head.next.next.next.next.next.next=new Node4(7);
//        head=deleteFirstNode(head);
//        deleteLastNode(head);
        //head=deleteNodeBeforeKey(0,head);
        //deleteNodeAfterKey(90,head);
        //head=deleteNodePositionWise(6,head);
        head=removeNthFromEnd(head,3);
        printLinedList(head);
    }
}
