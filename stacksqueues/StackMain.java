package com.bhoomi.stacksqueues;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new DynamicStack(5);

        stack.push(34);
        stack.push(3);
        stack.push(4);
        stack.push(56);
        stack.push(44);
        stack.push(89);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
