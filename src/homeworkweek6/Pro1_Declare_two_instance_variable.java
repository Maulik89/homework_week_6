package homeworkweek6;

public class Pro1_Declare_two_instance_variable {

    // Write a Java programme using the following steps.



    // 1.1 Declare two instance variables.
    String name = "Maulik"; // instance variable
    String surname = "Patel"; // instance variable
    public static void main(String[] args) { // main method declare

        Pro1_Declare_two_instance_variable t = new Pro1_Declare_two_instance_variable(); //create object
        t.p1();

    }
    public void p1(){ // instance method through object
        System.out.println(name);
        System.out.println(surname);
    }
}



