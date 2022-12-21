package homeworkweek6;

public class pro4_Both_instance_static {

   // Write a Java programme using the following steps.

    String car = "Auris"; // instance variable
    String gearbox = "Automatic"; // instance variable

    static String city = "Japan";  // static variable
    static int num = 13; // static variable

    public static void main(String[] args) { // main method
        pro4_Both_instance_static y = new pro4_Both_instance_static(); // create object
        y.m1(); // instance method access through object
        m2();  // static method call directly
    }

    public void m1(){
        System.out.println(car);
        System.out.println(gearbox);

    }
    public static void m2() {
        pro4_Both_instance_static y = new pro4_Both_instance_static();
        System.out.println(city);
        System.out.println(num);

}
}


