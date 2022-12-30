package week_7_homework;

// 12. Write a java program to input any two number and ask user to enter their symbol (+, -,
///, *) find addition, Subtraction, multiplication and division according to their symbol
//(using if else)

import java.util.Scanner;

public class input_any_two_numbers_12 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1,num2,result;
        char ch;

        System.out.println("Enter any two numbers:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        System.out.println("Enter the operators (+,-,*,/):");
        ch = scanner.next().charAt(0);

        if (ch == '+')
            result=num1 + num2;
        else if (ch == '-')
            result=num1 - num2;
        else if (ch == '*')
            result=num1 * num2;
        else if (ch == '/')
            result=num1 / num2;
        else
        {
            System.out.println("\nInvalid Input");
            return;

        }
        System.out.println("\nResult = "+result);
    }

}
