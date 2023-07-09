package com.Arrays;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
       // int[] arr = {1,23,589,565,2};
        int[] arr={0,2,1,5,3,4};
        int[] newArr = buildArray(arr);
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] buildArray(int[] nums) {
        int[] num=nums;
        for(int i=0;i<nums.length;i++){
            num[i]=nums[nums[i]];
        }
        System.out.println(Arrays.toString(num));
        return num;
    }
}
