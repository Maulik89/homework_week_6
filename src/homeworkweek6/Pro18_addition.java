package homeworkweek6;

import java.util.Scanner;

public class Pro18_addition {

    // 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
    //remainder of two numbers.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number : ");
        int num1 = in.nextInt(); // local variable

        System.out.println("Input second number : ");
        int num2 = in.nextInt();  // local variable

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // print statement
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // print statement
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // print statement
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // print statement
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2)); // print statement

}

}

