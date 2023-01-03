package Midweek_homework_7;
// 11. Write a program to print a string entered by user.

import java.util.Scanner;

public class Q11_print_string {

    public static void main(String[] args) {


        String colour;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Colour : ");
        colour = sc.nextLine();

        System.out.print(colour);
    }

}
