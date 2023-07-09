package com.methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99; //if we make a change to the object via ref variable, same object we will be changed
    }
}
