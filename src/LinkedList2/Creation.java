package LinkedList2;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Creation {

    //.............Printing LinkedList.............
    public static void printList(Node head){
        if(head==null){
            System.out.println("Empty Node");
        }
        Node curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    //.............LinkedList Creation........................
    public static Node listCreation(Node head,int data){
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

    //.............Adding Element at First Position........................
    public static Node addElementAtFirstPosition(Node head){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Element to add in the first:- ");
        int data=sc.nextInt();
        Node nn=new Node(data);
        nn.next=head;
        head=nn;
        return head;
    }

    //.........Adding Element at Last.........
    public static Node addElementLast(Node head){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Element to add in the last :- ");
        int data=sc.nextInt();
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return head;
        }
        if(head.next==null){
            head.next=null;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next=nn;
        return head;

    }

    //..............Adding Element at any position....................
    public static Node addElementAnyPosition(Node head){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Position :- ");
        int pos=sc.nextInt();
        System.out.print("Enter Element :- ");
        int data=sc.nextInt();
        Node nn=new Node(data);
        Node curr=head;
        if(pos==1){
            nn.next=curr;
            head=nn;
            return head;
        }
        for(int i=1;i<pos-1 && curr !=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            return head;
        }
        nn.next=curr.next;
        curr.next=nn;
        return head;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Limit of list :- ");
        int n=sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            System.out.print("Enter ["+(i+1)+"th] data :- ");
            int data=sc.nextInt();
            head=listCreation(head,data);
        }
        //head=addElementAtFirstPosition(head);
        //head=addElementLast(head);
        //head=addElementAnyPosition(head);
        printList(head);
        printList(head);
    }
}
