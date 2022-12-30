package week_6_homework;

public class Pro6_radius {

    // Write a program to enter any radius value of the circle and find out the
    //area.(Formula of Area A=PI*r*r).

    private static final double radius = 7.5;

    public static void main(String[] args) { //main method
        float pi = 3.1452f, area;      // local variable
        int r = 5;      // local variable

        area = pi * r * r;

        System.out.println("Area of the circle is:" + area);
}
}
