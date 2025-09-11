package LinkedList2;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class Deletion {

    //..........Deleting First Node.................
    public static Node1 deleteFirstNode(Node1 head){
        head=head.next;
        return head;
    }

    //..........Deleting Last Node...................
    public static void deleteLastNode(Node1 head){
        Node1 curr=head,prev=null;
        if(head==null || head.next==null){
            return;
        }
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
    }


    //............Deleting Particular Node................
    public static Node1 deleteParticularNode(Node1 head){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Any element which you want to delete :- ");
        int data=sc.nextInt();
        if(head==null){
            return head;
        }
        if (head.data == data) {
            return head.next;
        }
        Node1 curr=head, prev=null;
        while (curr!=null && curr.data!=data){
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        prev.next=curr.next;
        return head;
    }


    //.............Delete After Particular Key................
    public static void deleteAfterParticularKey(Node1 head){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Key :- ");
        int key=sc.nextInt();
        if(head==null || head.next==null){
            return;
        }
        Node1 curr=head;
        while(curr.data!=key && curr.next!=null){
            curr=curr.next;
        }
        if(curr.next==null){
            return;
        }
        curr.next=curr.next.next;
    }


    //........Delete Before Particular Key....................
    public static Node1 deleteBeforeKey(Node1 head){
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Key :- ");
        int key=sc.nextInt();
        Node1 prevPrev=null,prev=head,curr=head.next;
        if(head==null || head.next==null){
            return head;
        }
        if(head.next.data==key){
            head=head.next;
            return head;
        }
        while(curr!=null && curr.data!=key ){
            prevPrev=prev;
            prev=curr;
            curr=curr.next;
        }
        prevPrev.next=prev.next;
        return head;
    }


    //...........Printing LinkedList...................
    public static void printLinkedList(Node1 head){
        Node1 curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.print("null");
    }

    //.............LinkedList Creation................
    public static Node1 linkedListCreation(Node1 head,int data){
        Node1 nn=new Node1(data);
        if(head==null){
            return nn;
        }
        Node1 curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
        return head;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of Nodes :- ");
        int n=sc.nextInt();
        Node1 head=null;
        for(int i=0;i<n;i++){
            System.out.print("Enter ["+(i+1)+"th] Element :- ");
            int data=sc.nextInt();
            head=linkedListCreation(head,data);
        }
        //head=deleteFirstNode(head);
        //deleteLastNode(head);
        System.out.println("Before Deleting.......\n");
        printLinkedList(head);
        //head=deleteParticularNode(head);
        //deleteAfterParticularKey(head);
        head=deleteBeforeKey(head);
        System.out.println("\n\nafter Deleting.....");
        printLinkedList(head);
    }
}
