package LinkedList2;

import java.util.Scanner;
import java.util.Stack;

class Node2{
    int data;
    Node2 next;
    public Node2(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLinkedList {


    //----------List Creation--------------------
    public static Node2 listCreation(Node2 head, int data){

        Node2 nn=new Node2(data);
        if(head==null){
            return nn;
        }
        Node2 curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        nn.next=curr.next;
        curr.next=nn;
        return head;
    }

    //--------------Printing List-----------------------
    public static void printList(Node2 head){
        if(head==null){
            return;
        }
        Node2 curr=head;
        while (curr!=null){
            System.out.print(curr.data+"-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    //------------Reversing Linked List Using Stack---------------------
    public static void reverseLinkedListByStack(Node2 head){
        Stack<Integer> stack=new Stack<>();
        Node2 curr=head;
        while(curr!=null){
            stack.push(curr.data);
            curr=curr.next;
        }
        Node2 head2=null;
        while (!stack.isEmpty()){
            head2=listCreation(head2,stack.pop());
        }
        System.out.print("After reverse :- ");
        printList(head2);
    }


    //-------------Reversing LinkedList Using Array----------------
    public static void reverseLinkedListByArray(Node2 head,int n){
        int arr[]=new int[n];
        Node2 curr=head;
        for(int i=0;i<n;i++){
            arr[i]=curr.data;
            curr=curr.next;
        }
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        Node2 head2=null;
        for(int i=0;i<n;i++){
            head2=listCreation(head2,arr[i]);
        }
        printList(head2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of Nodes :- ");
        int n=sc.nextInt();
        Node2 head=null;
        for(int i=0;i<n;i++){
            System.out.print("Enter ["+(i+1)+"th] Element :- ");
            int data=sc.nextInt();
            head=listCreation(head,data);
        }
        printList(head);
        //reverseLinkedListByStack(head);
        reverseLinkedListByArray(head,n);
    }
}
