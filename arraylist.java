package com.praveen;
import java.util.ArrayList;
import java.util.*;


public class arraylist {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        ArrayList<Integer> list = new ArrayList<>();
////        list.add(5);
////        list.add(10);
////        list.add(20);
////        list.add(25);
////        System.out.println(list);
////        System.out.println(list.remove(0));
//
//    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        //Initialisation
//        for(int i = 0; i < 3; i++) {
//            list.add(new ArrayList<>());
//        }
//        //add elements
//
//        for(int i = 0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                list.get(i).add(sc.nextInt());
//            }
//        }
//
//        System.out.println(list);
//    }
//}
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}