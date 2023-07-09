package com.hari;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your ID:");
        int id = input.nextInt();
        System.out.println("Your ID is "+ id);

        // 10 is literal and a is identifier
        int a = 10;

        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
