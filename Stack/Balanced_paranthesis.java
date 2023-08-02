package com.praveen.Stack;
//
//import java.util.ArrayDeque;
//import java.util.Deque;
import java.util.*;
//
public class Balanced_paranthesis {
//    public static boolean matching(char a,char b){
//        return (( a=='(' && b==')' )||( a=='[' && b==']' )||( a=='{' && b=='}' ));
//    }
//
//    public static boolean isBalanced(String str){
//
//        Deque<Character> s=new ArrayDeque<>();
//
//        for (int i = 0; i < str.length(); i++)
//        {
//            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
//            {
//                s.add(str.charAt(i));
//            }
//            else{
//                if (s.isEmpty()==true)
//                    return false;
//                else if(matching(s.peek(),str.charAt(i))==false)
//                    return false;
//                else
//                    s.pop();
//            }
//        }
//        return (s.isEmpty()==true);
//    }
public static int func(int n){
    if(n<= 1){
        return n;
    }
    return func(n-1) + func(n-2);
}
    public static void main (String[] args) {

//        String str = "{()}[]";
//
//        if (isBalanced(str))
//            System.out.print("Balanced");
//        else
//            System.out.print("Not Balanced");Balanced

        int ans  = func(6);
        System.out.println(ans);

        int arr[] = {4,2,6,8,1};
        Arrays.sort(arr);
        System.out.println(arr[2]);

    }


}


