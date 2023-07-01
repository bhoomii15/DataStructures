package com.bhoomi.stacksqueues;

public class CustomQueue {
    protected int[] data;
    //defined length
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;

    }

    private boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isFull()) {
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int removed = data[0];
        //shift the elements to left //will shift till end element
        for(int i = 1; i < end; i++){
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public void display(){
        //displaying the elements
        for(int i =0; i < end; i++){
            System.out.print(data[i] + " < --");
        }
        System.out.println("END");
    }


}
