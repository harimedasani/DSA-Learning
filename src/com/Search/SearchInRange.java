package com.Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(LinearSearch(arr,31,1,3));

    }
    static String LinearSearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return "not valid";
        }
        for (int index=start;index<end;index++){
            if (arr[index]==target){
                return "exists";
            }
        }
        return "not exists";
    }
}
