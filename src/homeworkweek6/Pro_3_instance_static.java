package homeworkweek6;

public class Pro_3_instance_static {

    // Write a Java programme using the following steps.

    String name = "Montu"; //Instance variable
    static String surname = "Patel"; //static variable

    public static void main(String[] args) { //Main method
        Pro_3_instance_static x= new Pro_3_instance_static(); //Object created
        x.m1(); //Instance access via object
        m2();//direct access

    }
    public void m1() {
        System.out.println(name); // print instance variable
        System.out.println(surname); // print atatic variable

    }
    public static void m2(){
        Pro_3_instance_static x= new Pro_3_instance_static(); //Object created
        System.out.println(x.name);
        System.out.println(surname);
}

}
