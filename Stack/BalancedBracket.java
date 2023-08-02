package com.praveen.Stack;

import java.util.Stack;

public class BalancedBracket {
    public static void balanceBracket(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' | ch == '[' | ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (val == false) {
                    System.out.println(false);
                    return;
                }

            } else if (ch == ']') {
                boolean val = handleClosing(st, '[');
                if (val == false) {
                    System.out.println(false);
                    return;
                }

            } else if (ch == '}') {
                boolean val = handleClosing(st, '{');
                if (val == false) {
                    System.out.println(false);
                    return;

                }

            }

        }
        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

            public static boolean handleClosing (Stack< Character > st,char bracet){
                if (st.size() == 0) {
                    return false;
                } else if (st.peek() != bracet) {
                    return false;
                } else {
                    st.pop();
                    return true;
                }

            }

    public static void main(String[] args) {
        String s = "{(a+b)+(c+d)}";
        balanceBracket(s);
    }
}
