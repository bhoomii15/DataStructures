package com.bhoomi.stacksqueues;

public class CustomStack {
    //there will be an array
    protected int[] data;
    //defined length
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;


    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        //or you can simply do the following
        return data[ptr--];
    }

    public int peek() throws StackException {
        //return whats at the top
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length-1;
        //ptr is at last index and the array is hence full
    }

    private boolean isEmpty(){
        return ptr == -1;
        //ptr is -1 which means no elements exist in the array right now
    }

}
