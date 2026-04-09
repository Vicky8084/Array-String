package LinkedListPractice;

import java.util.Scanner;

public class ReverseLinkedList {


    //create LinkedList
    public static Node createLinkedList(Node head,int data){
        Node nn=new Node(data);
        if(head==null){
            return nn;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
        return head;
    }

    //Reverse LinkedList
    public static Node reverseLinkedList(Node head){
        Node curr=head;
        Node prev=null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //Print Linkedlist
    public static void printLinkedList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Limit of LinkedList :- ");
        int n=sc.nextInt();
        Node head=null;
        for(int i=1;i<=n;i++){
            System.out.print("Enter ["+i+"]th Element :- ");
            int data=sc.nextInt();
            head=createLinkedList(head,data);
        }
        System.out.print("Linkedlist Before Reversed :- ");
        printLinkedList(head);
        System.out.print("Linkedlist After Reversed :- ");
        head=reverseLinkedList(head);
        printLinkedList(head);

    }
}
