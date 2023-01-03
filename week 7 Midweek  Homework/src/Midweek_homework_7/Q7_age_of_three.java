package Midweek_homework_7;
// 8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.

import java.util.Scanner;

public class Q7_age_of_three {
    public static void main(String[] args)  {

        int age1, age2, age3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of Person one:  ");

        age1=sc.nextInt();

        System.out.print("Enter the age of Person two:  ");

        age2=sc.nextInt();

        System.out.print("Enter the age of Person three:   ");

        age3=sc.nextInt();

        if (age1 > age2 && age1 > age3)

            System.out.println("Person one is the Oldest.");

        else if (age2 > age1 && age2 > age3)

            System.out.println("Person two is the Oldest.");

        else if (age3 > age1 && age3 > age2)

            System.out.println("Person three is the Oldest.");

        else    {

            System.out.println("All have equal ages.");

            System.exit(0);

        }

        if (age1 < age2 && age1 < age3)

            System.out.println("Person one is the Youngest.");

        else if (age2 < age1 && age2 < age3)

            System.out.println("Person two is the Youngest.");

        else if (age3 < age1 && age3 < age2)

            System.out.println("Person three is the Youngest.");

        sc.close();

}
}

