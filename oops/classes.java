package com.praveen.oops;

public class classes {
   static class student{
        int rno;
        String name;
        float marks;

//        student(){
//            this.rno = 12;
//            this.name = "praveen";
//            this.marks = 50;
//
//    }
    //this is how you call constructor from another constructor
       //internally : new student(int rno, String name, float marks)
       student(){
            this(13,"random",50.5f);
       }
        student(int rno, String name, float marks){
            this.rno = rno;
            this.marks = marks;
            this.name = name;

       }

    }
    public static void main(String[] args) {
        student praveen = new student();
        System.out.println(praveen.rno);
        System.out.println(praveen.name);
        System.out.println(praveen.marks);

        student pk = new student(12,"pk",40.5f);
        System.out.println(pk.rno);
        System.out.println(pk.name);
        System.out.println(pk.marks);    }
}
