import java.util.Scanner;

public class Q6_school_grading{
    // 6. A school has following rules for grading system:
    //a. Below 25 - F
    //b. 25 to 45 - E
    //c. 45 to 50 - D
    //d. 50 to 60 - C
    //e. 60 to 80 - B
    //f. Above 80 - A

    public static  void main(String[] args){



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");

        int w = sc.nextInt();
        if (w < 25){
            System.out.println("F");

        }
        else if (( w >= 25) && ( w < 45)){
            System.out.println("E");

        }
        else if (( w >= 45) && ( w < 50)){
            System.out.println("D");

        }
        else if (( w >= 50) && ( w < 60)){
            System.out.println("C");

        }
        else if (( w >= 60) && ( w < 80)){
            System.out.println("B");

        }
        else if (( w >= 80) && (w <= 100)){
            System.out.println("A");

        }
        else{
            System.out.println("Not correct marks");
        }
}

}
