package homeworkweek6;

import java.util.Scanner;

public class Pro7_temperature {

    // Write a program to insert any temperature value in degree Fahrenheit and
    //convert to degree Celsius ((F − 32) × 5/9 = 0°C).

    public static void main(String[] args) { // main method

        Scanner input = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble(); // local variable

        double celsius =(( 5 *(fahrenheit - 32.0)) / 9.0); // local variable
        System.out.println(fahrenheit + "degree Fahrenheit is equal to " + celsius + "in celsius");

}
}


