package LinkedListPractice;

import java.util.Scanner;

public class DeleteNodeFromLinkedList {
    static Scanner sc=new Scanner(System.in);

    //Creating LinkedList
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
    //Delete First node
    public static Node deleteFirstNode(Node head){
        if(head==null){
            System.out.println("There is not available any node to delete...");
            return head;
        }
        head=head.next;
        return head;

    }


    //Delete Last Node
    public static Node deleteLastNode(Node head){
        if(head==null){
            return head;
        }
        if(head.next==null){
            head=null;
            return head;
        }
        Node curr=head,prev=null;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        return head;
    }


    //Delete After Particular Node
    public static Node deleteAfterParticularNode(Node head){
        System.out.print("Enter any Elements that you want to delete after this element :- ");
        int data=sc.nextInt();
        if(head==null){
            System.out.println("Linkedlist is Empty");
        }
        if(head.next==null){
            return null;
        }
        if(head.next.data==data){
            head.next=null;
            return head;
        }

return head;
    }



    //Delete Before Particular Node


    //Delete Particular Node
    public static Node deleteParticularNode(Node head){
        System.out.print("Enter any Element which you want to delete :- ");
        int data=sc.nextInt();
        if(head==null){
            System.out.println("LinkedList is Empty");
            return head;
        }
        if(head.data==data){
            head=head.next;
            return head;
        }
        Node curr = head;
        while(curr.next != null && curr.next.data != data)
            curr = curr.next;
        if(curr.next==null){
            System.out.println("There is not any Element in the LinkedList which you want to delete");
            return head;
        }
        curr.next=curr.next.next;
        return head;
    }

    //Printing Linkedlist
    public static void printLinkedList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        System.out.print("Enter Limit of LinkedList :- ");
        int n=sc.nextInt();
        Node head=null;
        for(int i=1;i<=n;i++){
            System.out.print("Enter ["+i+"]th Element :- ");
            int data=sc.nextInt();
            head=createLinkedList(head,data);
        }
        printLinkedList(head);
//        head=deleteFirstNode(head);
//        printLinkedList(head);
//        head=deleteLastNode(head);
//        printLinkedList(head);
        head=deleteParticularNode(head);
        printLinkedList(head);
    }
}
