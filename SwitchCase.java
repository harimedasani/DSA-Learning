package com.hari;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit){
            case "Mango":
                System.out.println("king of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            default:
                System.out.println("enter valid");
        }
    }
}
