package week_7_homework;

// 10. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry

import java.util.Scanner;

public class input_any_alphabet_10 {


        public static void main(String[] args) {


            char a = 'A';
            char f = 'F';

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A or F:");
            char alphabetic = sc.next().charAt(0);


            if (alphabetic == 'A') {
                System.out.println("Country is Armenia");
            } else if (alphabetic != 'F') {
                System.out.println("country is France");

            } else {
                System.out.println("other country");
            }
        }
    }

