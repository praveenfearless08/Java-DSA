package com.praveen;

public class String_Search {
    static boolean searchString(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String name = "praveen";
        char target = 'a';
        boolean ans =  searchString(name,target);
        System.out.println(ans);

    }
}
