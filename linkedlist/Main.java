package com.bhoomi.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(33);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(43);
        list.insertFirst(4);
        list.insertLast(100);
        list.insert(99, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();


    }
}
