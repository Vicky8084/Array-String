package StackImplementation;
public class Queue {
    int[] queue;
    int rear,front,size;
    public Queue(int size){
        queue=new int[size];
        rear=front=-1;
        this.size=size;
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return rear==size-1;
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full - overflow");
            return;
        }
        if(isEmpty()){
            front = 0;
        }
        queue[++rear] = element;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty - underflow");
            return -1;
        }
        if(front == rear){
            front = rear = -1;
        } else {
            front++;
        }

        int val = queue[front];
        return val;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty - Underflow");
            return -1;
        }
        return queue[front];
    }
    public static void main(String[] args) {

    }
}
