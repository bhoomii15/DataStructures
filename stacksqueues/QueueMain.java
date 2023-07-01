package com.bhoomi.stacksqueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue();
        queue.insert(2);
        queue.insert(12);
        queue.insert(22);
        queue.insert(32);
        queue.insert(42);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);

        queue.display();
    }
}
