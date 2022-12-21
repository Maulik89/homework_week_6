package homeworkweek6;


import java.util.Scanner;

public class Pro13_Average {


    // Write a Java program that takes three numbers as input to calculate and
    //print the average of the numbers.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m1, m2, m3; // local variable

        System.out.println("Input first number: ");
        m1 = sc.nextInt(); //local variable

        System.out.println("Input Second number: ");
        m2 = sc.nextInt();//local variable

        System.out.println("Input Three number: ");
        m3 = sc.nextInt();//local variable

        System.out.println("Average of three numbers is: " + (m1 + m2 + m3)/3);

}
}





