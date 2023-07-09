package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives
        int[] arr = new int[5];
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
//        for(int i=0;i< arr.length;i++) {
//            System.out.print(arr[i]+" ");
//        }
        for (int num:arr) {
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str = new String[2];
        int j=0;
        for (String s:str) {
            str[j++]= in.next();
        }
        for (String s:str){
            System.out.println(s);
        }
        System.out.println(Arrays.toString(str));
    }
}
