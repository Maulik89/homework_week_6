package midweek_5_Homework;
import java.util.Scanner;

public class Tenth_marksheet {
    public static void main(String[] args) {
        String name;
        int roll, math, sci, eng;

        Scanner SC=new Scanner(System.in);

        System.out.print("Enter Name: ");
        name=SC.nextLine();
        System.out.print("Enter Roll Number: ");
        roll=SC.nextInt();
        System.out.print("Enter marks in Maths, Science and English: ");
        math=SC.nextInt();
        sci=SC.nextInt();
        eng=SC.nextInt();

        int total=math+eng+sci;
        float perc=(float)total/300*100;

        System.out.println("Roll Number:" + roll +"\tName: "+name);
        System.out.println("Marks (Maths, Science, English): " +math+","+sci+","+eng);
        System.out.println("Total: "+total +"\tPercentage: "+perc);

    }
}
