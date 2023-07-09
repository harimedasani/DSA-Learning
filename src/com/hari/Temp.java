package com.hari;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in Celsius:");
        float temp = input.nextFloat();
        System.out.println("In Fahrenheit:" + ((temp*1.8)+32));
    }
}
