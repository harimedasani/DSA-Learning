package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr2D = new int[3][3];
        for (int i=0;i< arr2D.length;i++){
            for (int j = 0;j< arr2D[i].length ;j++){
                arr2D[i][j] = in.nextInt();
            }
        }
        for (int i = 0;i< arr2D.length;i++){
            for (int j = 0;j<arr2D[i].length;j++){
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        for (int i =0;i<arr2D.length;i++){
            System.out.println(Arrays.toString(arr2D[i]));
        }

        for (int[] a: arr2D){
            System.out.println(Arrays.toString(a));
        }
    }
}
