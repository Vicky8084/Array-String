package StackImplementation;

import java.util.Scanner;

public class Stack{
    int[] stack;
    int top;
    int size;
    public Stack(int size){
        this.size=size;
        top=-1;
        stack=new int[size];
    }

    public void push(int element){
        if(top>=size-1){
            System.out.println("Stack is full - overflow");
            return;
        }
        top++;
        stack[top]=element;
    }
    public int size(){
        return top+1;
    }
    public int peek(){
        if(top<=-1){
            System.out.println("Stack is Empty - underflow");
            return Integer.MIN_VALUE;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        if(top<=-1){
            return true;
        }
        return false;
    }
    public int pop(){
        int val=peek();
        if(val!=Integer.MIN_VALUE){
            top--;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of stack :- ");
        int n=scanner.nextInt();
        Stack stack =new Stack(n);
        stack.push(5);
        System.out.println(stack.peek());
        stack.push(6);
        System.out.println(stack.isEmpty());
    }
}
