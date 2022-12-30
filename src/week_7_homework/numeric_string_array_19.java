package week_7_homework;

import java.util.Arrays;

// 19. Write a Java program to sort a numeric array and a string array.
public class numeric_string_array_19 {
    public static void main(String[] args){

        int[] num={13,05,14,06,15};
        String[] str={"Montu", "Patel"};

        Arrays.toString(num);
        Arrays.toString(str);


        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

    }
}

