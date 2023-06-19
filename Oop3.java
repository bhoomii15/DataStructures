package com.bhoomi;

public class Oop3 {
    double l;
    double h;
    double w;

    Oop3(){ //we are initialising a box
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Oop3(double a){
        this.h = a;
        this.l = a;
        this.w = a;
    }

    //cuboid
    Oop3(double h, double l, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Oop3(Oop3 old){
        this.h = old.h;
        this.l =old.l;
        this.w = old.l;
    }

    public void info(){
        System.out.println("running the box");
    }
}
