package week_6_homework;

public class Pro16_binary_numbers {

    // Write a Java program to add two binary numbers.

    public static void main(String[] args) {
        // two binary numbers in string format
        String binaryd = "10", binarye = "11";

        // converting strings into binary format numbers
        Integer a = Integer.parseInt(binaryd, 2);
        Integer b = Integer.parseInt(binarye, 2);

        // adding two integers
        Integer output = a  + b;

        // converting final output back to Binary Integer
        System.out.println(Integer.toBinaryString(output));
}
}


