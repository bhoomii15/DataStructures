package com.bhoomi.stacksqueues;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); //it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size); //it will call CustomStack(size);
    }

    //the only thing that changes in a dynamic stack is the pop method
    //if you want to use the pop method of Dynamic Stack then you will need OVERRIDE

    @Override
    public boolean push(int item){
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all prev items
            for(int i =0; i < data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }
        //insert item
        return super.push(item);
    }
}
