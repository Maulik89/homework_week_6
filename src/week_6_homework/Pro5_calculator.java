package week_6_homework;

import java.util.Scanner;
public class Pro5_calculator {

    int add, subtract, multiply; // Instance variables

    public static void main(String[] args) {
        int first, second, add, subtract, multiply; //Local variables
        float divide; // Local variables
        Scanner scanner = new Scanner(System.in); // scanner obj


        System.out.print("Enter two numbers: ");
        first = scanner.nextInt(); // get user inputs via scanner class
        second = scanner.nextInt(); // get user inputs via scanner class

        add = first + second; //math
        subtract = first - second; //math
        multiply = first * second; //math
        divide = (float) first / second; //math


        System.out.println("Sum = " + add); //call out the functions
        System.out.println("Difference = " + subtract); //call out the functions
        System.out.println("Multiplication = " + multiply); // call out functions
        System.out.println("Division = " + divide); //call out functions

}

}


