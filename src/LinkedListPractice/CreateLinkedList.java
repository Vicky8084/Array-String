package LinkedListPractice;

import java.util.Scanner;

public class CreateLinkedList {
    //Creating LinkedList
    public static Node createLinkedList(Node head, int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        return head;
    }

    //Printing LinkedList
    public static void printLinkedList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of linkedlist :- ");
        int n=sc.nextInt();
        Node head=null;
        int data=0;
        for(int i=0;i<n;i++) {
            System.out.print("Enter [" + (i + 1) + "]th Node's Data :- ");
            data = sc.nextInt();
            head=createLinkedList(head, data);
        }
        printLinkedList(head);
    }
}
