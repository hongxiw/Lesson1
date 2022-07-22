public class Person {

    /*
       static variables

       instance variables

       constructors

       getter/setter methods

       other methods

       helper methods
     */

    private String firstName;

    private String lastName;

    private int age;

    public Person() {
        firstName = "John";
        lastName = "Doe";
        age = 21;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void birthday() {
        age++;
    }

    public void ageByYears(int years) {
        age += years;
    }

    public void eat() {
        System.out.println(firstName + " is eating!");
    }

    public void sleep(int hours) {
        System.out.println(firstName + " slept for " + hours + " hours");
    }

    public void ageByYearsAndPrint(int years) {
        ageByYears(years);
        System.out.println(firstName + " is now " + age);
    }


    public String toString() {
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age;
    }

}