package LinkedList;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data=data;
        this.next=null;
    }
}


public class CreationLinkedList {
    public static Node1 creationLinkedList(int data,Node1 head){
        Node1 nn=new Node1(data);
        if(head==null){
            return nn;
        }
        Node1 curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }

        curr.next=nn;
        return head;
    }

    public static void printLinkedlist(Node1 head){
        Node1 curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limits of linked list :- ");
        int n=sc.nextInt();
        Node1 head=null;
        for(int i=1;i<=n;i++){
            System.out.print("Enter data :- ");
            int data=sc.nextInt();
            head=creationLinkedList(data,head);
        }
        printLinkedlist(head);
    }
}
