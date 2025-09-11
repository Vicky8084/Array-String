package LinkedList2;

import java.util.Scanner;

class Node3{
    int data;
    Node3 next;
    public Node3(int data){
        this.data=data;
        next=null;
    }
}
public class ReverseList {

    //----------------Printing Linked List----------------
    public static void printLinkedList(Node3 head){
        if(head==null){
            return;
        }
        Node3 curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    //-----------------List Creation-----------------
    public static Node3 listCreation(Node3 head, int data){
        Node3 nn=new Node3(data);
        if(head==null){
            return nn;
        }
        Node3 curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        nn.next=curr.next;
        curr.next=nn;
        return head;
    }

    //----------Reversing Linked List--------------
    public static Node3 reverseList(Node3 head){
        Node3 prev = null;
        Node3 curr = head;

        while (curr != null) {
            Node3 next = curr.next; // store next
            curr.next = prev;       // reverse pointer
            prev = curr;            // move prev forward
            curr = next;            // move curr forward
        }
        return prev; // new head
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit for Node creation :- ");
        int n=sc.nextInt();
        Node3 head=null;
        for(int i=0;i<n;i++){
            System.out.print("Enter Data in the node :- ");
            int data=sc.nextInt();
            head=listCreation(head,data);
        }
        System.out.println("Before Reversed :- ");
        printLinkedList(head);
        System.out.println("After Reversed :- ");
        head=reverseList(head);
        printLinkedList(head);
    }
}
