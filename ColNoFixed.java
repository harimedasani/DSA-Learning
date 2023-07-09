package com.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4},
                {10,11},
                {7,5,6,8}
        };

        for (int row=0; row< arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        int[][] grid={{5,1,0},{-5,-5,-5}};

        int count = 0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid.length;col++){
                if(grid[row][col]<0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
