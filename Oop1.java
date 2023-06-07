package com.bhoomi;

public class Oop1 {
    public static void main(String[] args) {
        Student bhoomi = new Student();

        System.out.println(bhoomi.rno);
        System.out.println(bhoomi.name);
        System.out.println(bhoomi.marks);

        Student one = new Student();
        Student two = one;

        one.name = "Bhoomi";
        System.out.println(two.name);

        final A bhoom = new A("Bhoomi Sharma");
        bhoom.name = "Khushi"; //can be done
//


    }
}
class Student{
    int rno;
    String name;
    double marks;

    Student(){
        this.name = "Bhoomi";
        this.rno = 15;
        this.marks = 98.0;

    }
}

class A{
    final int num = 20;
    String name;

    public A(String name){
        this.name = name;
    }


}

//where