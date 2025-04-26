package com.gevernova.collections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> queueOne = new LinkedList<>();
    Queue<Integer> queueTwo = new LinkedList<>();
    // push elements into the stack
    public void push(int x){
        queueTwo.add(x); // add new element in q2
        // move all elements from q1 to q2
        while(!queueOne.isEmpty()){
            queueTwo.add(queueOne.poll());
        }
        // swap q1 and q2
        Queue<Integer> temp = queueOne;
        queueOne = queueTwo;
        queueTwo = temp;
    }
    // remove the elements on top of the stack
    public int pop(){
        if(queueOne.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return queueOne.poll();
    }
    // get the top element
    public int top(){
        if(queueOne.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return queueOne.peek();
    }
    // check if the stack is empty
    public boolean isEmpty(){
        return queueOne.isEmpty();
    }
    // main method
    public static void main(String[] args){
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(30);

        // printing them
        System.out.println("Top element is : "+stack.top());
        System.out.println("Popped element is : "+stack.pop());
        System.out.println("Top element now : "+stack.top());
    }
}
