package com.hari;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int number = input.nextInt();
//        System.out.println(num);

        //Type casting
        int n = (int)(67.56f);
        System.out.println(n);

        //automatic type promotion in expressions
        int a =257;
        byte b = (byte) (a); // 257 % 256 = 1
        System.out.println(b);

        byte x = 30;
        byte y = 20;
        byte z = 100;
        int res = (x * y) / z;
        System.out.println(res);

        int number = 'a';
        System.out.println(number);

        byte d = 42;
        char c = 'a';
        short s = 1024;
        int i =5000;
        float f = 5.67f;
        double k = 0.1234;
        double result = (f * d) + (i / c) - (k * s);
        // float + int + double = double(larger)
        System.out.println((f * d) + " " + (i / c)+ " "+ (k * s));
        System.out.println(result);

    }
}
