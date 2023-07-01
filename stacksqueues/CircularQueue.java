package com.bhoomi.stacksqueues;

public class CircularQueue {

    protected int[] data;
    //defined length
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
//        return end == data.length; //end wont be used here as end will eventually come back to index 0
        return size == data.length;

    }

    private boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        //no need for shifting here
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return data[front];
    }

    public void display(){
//        for(int i = front; i < end; i++){
//            System.out.print(data[i] + " <-- ");
//        }
//        System.out.println("END");
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " --> ");
            i++;
            i %= data.length;
        } while (i != end);
            System.out.println("END");
    }
}
