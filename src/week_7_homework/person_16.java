package week_7_homework;

public class person_16 {

    String firstName;
    String lastName;
    int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public boolean setAge(int age){
        if(age<0 && age>100){
            return true;
        }else {
            return false;
        }
    }
    public boolean isTeen(){
        if (age>12 || age<20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        return this.firstName + " " + this.lastName;

    }

    public static void main(String[] args) {
        person_16 person = new person_16();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
