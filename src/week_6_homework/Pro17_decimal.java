package week_6_homework;

import java.util.Scanner;

public class Pro17_decimal {

    // Write a Java program to convert a decimal number to binary number.

    public static void main(String[] args) { // main method

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number ::");
        int decimal = sc.nextInt(); //local variable

        String result = Integer.toBinaryString(decimal);
        System.out.println("Convert Binary value into decimal number is ::" + result);
}
}

