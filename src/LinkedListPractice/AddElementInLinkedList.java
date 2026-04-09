package LinkedListPractice;

import java.util.Scanner;

public class AddElementInLinkedList {
    static Scanner sc=new Scanner(System.in);
    //Creating Linked List
    public static Node createLinkedList(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        return head;
    }

    //Adding Element at First/Beginning Position
    public static Node addElementAtBeginning(Node head,int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }

    //Adding Element at Last/End Position
    public static Node addElementAtEnd(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        return head;
    }

    public static int countLinkedListNodes(Node head){
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }

    //Adding Element at Specific position
    public static Node addElementAtSpecificPosition(Node head){
        System.out.print("Linked List Before Adding Node at Specific Position :- ");
        printLinedList(head);
        System.out.print("Enter Position where Node will be inserted :- ");
        int pos=sc.nextInt();
        if(pos<1 || pos>countLinkedListNodes(head)+1){
            System.out.println("you have not entered valid position");
            return head;
        }
        System.out.print("Enter Element to add :- ");
        int data=sc.nextInt();
       Node newNode=new Node(data);
       if(head==null && pos==1){
           return newNode;
       }
       if(pos==1){
           newNode.next=head;
           head=newNode;
           return head;
       }
       Node curr=head;
       for(int i=1;i<pos-1;i++) {
           curr = curr.next;
       }
       newNode.next=curr.next;
       curr.next=newNode;
       return head;
    }


    //Adding Element After particular Node
    public static Node addElementAfterParticularNode(Node head){
        System.out.print("Linked List before adding element :- ");
        printLinedList(head);
        System.out.print("Enter the element after which you want to insert new node :- ");
        int target = sc.nextInt();
        System.out.print("Enter the new element to insert :- ");
        int data = sc.nextInt();
        Node curr=head;
        if(head == null){
            System.out.println("Linked List is empty.");
            return head;
        }
        while(curr!=null && curr.data!=target){
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("The element after which you want to insert in not available");
            return head;
        }
        Node newNode=new Node(data);
        newNode.next=curr.next;
        curr.next=newNode;
        return head;
    }


    //Printing Linked List
    public static void printLinedList(Node head){
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        System.out.print("Enter limit of a LinkedList :- ");
        int n=sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            System.out.print("Enter ["+(i+1)+"]th Element :- ");
            int data=sc.nextInt();
            head=createLinkedList(head,data);
        }
//        System.out.print("Linked List Before Adding Node at Beginning :- ");
//        printLinedList(head);
//        System.out.print("Enter Element to add at Beginning :- ");
//        int data=sc.nextInt();
//        head=addElementAtBeginning(head,data);
//        System.out.print("Linked List after Adding Node at Beginning :- ");
//        printLinedList(head);
//        System.out.print("Enter Element to add at Last :- ");
//        data=sc.nextInt();
//        head=addElementAtEnd(head,data);
//        System.out.print("Linked List after Adding Node at End :- ");
//        printLinedList(head);
//        head=addElementAtSpecificPosition(head);
//        System.out.print("Linked List after Adding Node at Specific Position :-");
//        printLinedList(head);

        head=addElementAfterParticularNode(head);
        System.out.print("Linked List after added Element :- ");
        printLinedList(head);
    }
}
