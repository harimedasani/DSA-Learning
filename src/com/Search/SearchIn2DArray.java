package com.Search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {98,3,79,9},
                {3547,67},
                {23,77,97}
        };
        int target = 970;
        int[] ans = Search(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Search(int[][] arr,int target){
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
