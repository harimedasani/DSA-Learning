package com.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18,12,9,14};
        int target = 1;
        String ans=LinearSearch(arr,target);
        System.out.println(ans);
    }
    static String LinearSearch(int[] arr,int target){
        if(arr.length==0){
            return "not valid";
        }
        for (int index=0;index<arr.length;index++){
            if (arr[index]==target){
                return "exists";
            }
        }
        return "not exists";
    }
}
