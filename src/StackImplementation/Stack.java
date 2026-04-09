package StackImplementation;
public class Stack{
    int[] stack;
    int top;
    int size;
    public Stack(int size){
        this.size=size;
        stack=new int[size];
        top=-1;
    }
    public void push(int element){
        if(top>=size-1){
            System.out.println("Stack is full - overflow");
            return;
        }
        top++;
        stack[top]=element;
    }

    public static void main(String[] args) {

    }
}
