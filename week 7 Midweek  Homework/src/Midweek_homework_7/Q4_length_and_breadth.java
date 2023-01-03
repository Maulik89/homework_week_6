package Midweek_homework_7;

import java.util.Scanner;

public class Q4_length_and_breadth {

        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the length: ");

            double length = sc.nextDouble();

            System.out.println("Enter the breadth: ");

            double breadth = sc.nextDouble();

            if (length == breadth)

                System.out.println("It is a Square.");

            else
                System.out.println("It is not a Square...");
        }
    }

