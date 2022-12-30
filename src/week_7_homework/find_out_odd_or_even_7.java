package week_7_homework;

// 7. Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class find_out_odd_or_even_7 {
    public static void main(String[] args) {

        int num;
        System.out.print("Enter an Intiger number: ");


        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        // If number is divisible by 2 then it's an even number
        //else it is an odd number
        if ( num % 2 == 0 )
            System.out.println(num+" is an even number.");
        else
            System.out.println(num+" is an odd number.");
    }
}


