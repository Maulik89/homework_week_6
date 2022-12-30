package week_7_homework;

// 18. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”

public class positive_negative_zero_18 {
    public static void main(String[] args) {
        int day = 6;

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
                break;
        }
    }
}

