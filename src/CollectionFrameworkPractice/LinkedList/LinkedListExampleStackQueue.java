package CollectionFrameworkPractice.LinkedList;

import java.util.LinkedList;

public class LinkedListExampleStackQueue {
    public static void main(String[] args) {
        /*
        Stack stack=new Stack();
        stack.push(4);
        stack.push(6);
        stack.push(3);
        stack.push(2);
        stack.push(9);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        */
        Queue queue=new Queue();
        queue.enqueue(45);
        queue.enqueue(46);
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(75);
        queue.enqueue(505);
        System.out.println(queue);
    }
}
class Stack{
    private LinkedList<Integer> list;
    Stack(){
        list=new LinkedList<>();
    }
    //push
    public void push(int item){
        list.addFirst(item);
    }
    //pop
    public int pop(){
        return list.removeFirst();
    }
    //pick
    public int pick(){
        return list.getFirst();
    }
    //isEmpty
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "list=" + list +
                '}';
    }
}
class Queue{
    LinkedList<Integer> list;
    Queue(){
        list=new LinkedList<>();
    }
    //enqueue(push)
    public void enqueue(int item){
        list.addFirst(item);
    }
    //dequeue(pop)
    public int dequeue(){

        return list.removeLast();
    }
    //peek
    public int peek(){
        return list.getLast();
    }
    //isEmpty
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "list=" + list +
                '}';
    }
}
