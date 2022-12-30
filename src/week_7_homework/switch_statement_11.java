package week_7_homework;

//11. Same as above program-8 using switch statement.

import java.util.Scanner;

public class switch_statement_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any alphabet from A to F : " );
        String city = sc.next();

        switch (city){
            case "A":
                System.out.println("Apple");
                break;
            case "B":
                System.out.println("Banana");
                break;
            case "C":
                System.out.println("Cox apple");
                break;
            case "D":
                System.out.println("Dates");
                break;
            case "E":
                System.out.println("Egg");
                break;
            case "F":
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid Entry");
        }
}
}
