package com.praveen.BinarySearchTree;
import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {

        TreeSet<String> s = new TreeSet<String>();

        // Elements are added using add() method
        s.add("gfg");
        s.add("courses");
        s.add("ide");

        // Displaying the TreeSet
        // in sorted order
        System.out.println(s);

        // Checking whether "ide" is present
        // or not
        System.out.println(s.contains("ide"));

        // Iterator to traverse the TreeSet
        Iterator<String> a = s.iterator();
        while(a.hasNext())
            System.out.println(a.next());



        // Creating an empty TreeSet
        TreeSet<Integer> i = new TreeSet<Integer>();

        // Elements are added using add() method
        i.add(10);
        i.add(5);
        i.add(2);
        i.add(15);
        // Prints the largest value lower than 5
        // Here it is 2
        System.out.println(i.lower(5));

        // Prints the smallest higher value than 5
        // Between 10 and 15 smallest is 10
        System.out.println(i.higher(5));

        // Value <= 5
        System.out.println(i.floor(5));

        // Value >= 5
        System.out.println(i.ceiling(5));


        // foreach way of traversal
        for(Integer x:i) {
            System.out.print(x + " ");
        }
    }
    }




