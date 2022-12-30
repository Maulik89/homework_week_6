package week_7_homework;
//Declare multidimensional array and store 5 countries and their
//capital and print them in console.

public class multidimensional_3 {


     public static void main(String[] args){
        String[][] array = {{"India", "Delhi"},
                            {"America", "Washington"},
                            {"United Kingdom", "London"},
                            {"Australia", "Canberra"},
                            {"Canada", "Ottawa"}};




        System.out.println("Country is  " +array[0][0] + " and their Capital is " +array[0][1]);
        System.out.println("Country is  " +array[1][0] + " and their Capital is " +array[1][1]);
        System.out.println("Country is  " +array[2][0] + " and their Capital is " +array[2][1]);
        System.out.println("Country is  " +array[3][0] + " and their Capital is " +array[3][1]);
        System.out.println("Country is  " +array[4][0] + " and their Capital is " +array[4][1]);
    }
}
