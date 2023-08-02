package com.praveen.Stack;

import java.util.Stack;

public class Duplicates_bracket {
    public static void DuplicateBracket(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
             if(ch == ')'){
                 if(st.peek() == '('){
                     System.out.println(true);
                     return;
                 }else{
                     while(st.peek() != '('){
                         st.pop();
                     }
                     st.pop();
                 }

             }else{
                 st.push(ch);
             }
        }
        System.out.println(false);
    }
    public static void main(String[] args) throws Exception {
           String s = "(a+b)+((c+d))";
           DuplicateBracket(s);
    }
}
