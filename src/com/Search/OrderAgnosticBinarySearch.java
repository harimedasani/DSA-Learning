package com.Search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,4};
        int target = 8;
        System.out.println(orderAgnosticBS(arr,target));

    }
    static int orderAgnosticBS(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;

        boolean isAsc = arr[s] < arr[e];

        while (s<=e){
            int m = s + (e-s)/2;
            if(arr[m] == target){
                return m;
            }
            if(isAsc) {
                if (target > arr[m]) {
                    s = m + 1;
                } else if (target < arr[m]) {
                    e = m - 1;
                }
            }
            else {
                if (target < arr[m]) {
                    s = m + 1;
                } else if (target > arr[m]) {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
