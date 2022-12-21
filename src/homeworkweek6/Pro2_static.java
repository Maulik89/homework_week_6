package homeworkweek6;

public class Pro2_static {


    //Declare two static variables

    static int age = 30; // Static variable

    static String name = "Montu"; //Static Variable


    static void disp(){ // Static method
        System.out.println("Age is :" +age); //Calling static variable in print statement
        System.out.println("Name is :" +name); // Calling static variable in print statement


    }
    public static void main(String[] args) { //Main method

        disp(); // Calling static method


}

}