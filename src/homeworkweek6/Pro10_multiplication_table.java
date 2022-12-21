package homeworkweek6;

import java.util.Scanner;

public class Pro10_multiplication_table {

    // Write a Java program that takes a number as input and prints its
    //multiplication table up to 10.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n; //local variable

        System.out.println("Input a number:");
        n = in.nextInt();

        System.out.println("8" + "*" + "1" + "=" + (n * 1));
        System.out.println("8" + "*" + "2" + "=" + (n * 2));
        System.out.println("8" + "*" + "3" + "=" + (n * 3));
        System.out.println("8" + "*" + "4" + "=" + (n * 4));
        System.out.println("8" + "*" + "5" + "=" + (n * 5));
        System.out.println("8" + "*" + "6" + "=" + (n * 6));
        System.out.println("8" + "*" + "7" + "=" + (n * 7));
        System.out.println("8" + "*" + "8" + "=" + (n * 8));
        System.out.println("8" + "*" + "9" + "=" + (n * 9));
        System.out.println("8" + "*" + "10" + "=" + (n * 10));
}
}




