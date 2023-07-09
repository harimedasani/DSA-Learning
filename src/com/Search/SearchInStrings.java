package com.Search;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Hari";
        char target = 'a';
        System.out.println(Search(name,target));
        System.out.println(Search1(name,target));
    }
    static boolean Search1(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (char ch:str.toCharArray()) {
            if (ch==target){
                return true;
            }
        }
        return false;
    }


    static boolean Search(String str,char target){
        if (str.length()==0){
            return false;
        }
        for (int i =0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
