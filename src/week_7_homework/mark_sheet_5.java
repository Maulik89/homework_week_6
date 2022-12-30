package week_7_homework;

// 5. Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 to 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
//|
//| Mark Sheet

import java.util.Scanner;

public class mark_sheet_5 {

    public static void main(String[] args) {
//        int rollNo = 13;
//        String name = "montu";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Student name : ");
        String studName = scanner.next();

        System.out.println("Input Student's Roll no : ");
        int rollno = scanner.nextInt();

        System.out.println("Enter marks of Maths : ");
        int maths = scanner.nextInt();
        while (maths > 100) {
            System.out.println("invalid input, Marks should between 0 to 100: " );
            System.out.println("Enter marks again:");
            maths = scanner.nextInt();
        }

        System.out.println("Enter marks of Science : ");
        int sci = scanner.nextInt();

        while ( sci > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100: ");
            System.out.println("Enter marks again:");
            sci = scanner.nextInt();
        }
        System.out.println("Enter marks of Science : ");
        int eng = scanner.nextInt();

        while ( eng > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100: ");
            System.out.println("Enter marks again:");
            eng = scanner.nextInt();


            int total = maths + sci + eng;
            float percentage = (total * 100)/300;

            String result = "";
            String grade = "";
            if (percentage >= 80){
                grade = "A+";
                result = "pass";
            } else if (percentage >=60) {
                grade = "A";
                result = "pass";
            }else if (percentage >=50) {
                grade = "B";
                result = "pass";
            }else if (percentage >=35){
                    grade = "C";
                    result = "pass";

                }else{
                grade = "fail";
                result = "fail";


                }
            System.out.println("_________________________________________________");
            System.out.println("|              Marksheet                         |");
            System.out.println("|                                               |");
            String name = null;
            System.out.println("|Name:                                 "+name + "|");
            System.out.println("|Roll No:                                "+rollno +   "|");
            System.out.println("|                                                |");
            System.out.println("__________________________________________________");
            System.out.println("|Subject:                                  Marks   |");
            System.out.println("|___________________________________________________|");
            System.out.println("|Math :                                  "+maths+  "|");
            System.out.println("|Science :                               "+sci+   "|");
            System.out.println("|English  :                              "+eng+    "|");
            System.out.println("|__________________________________________________");
            System.out.println("total     :      maths+sci+eng"                      );
            System.out.println("percentag :                   b(double)((total/3");
            System.out.println("|Total                                    "+total+ "|");
            System.out.println("|__________________________________________________|");


                }

            }


        }


