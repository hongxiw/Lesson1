public class Main {

    public static void main(String[] args) {

        // constructors
        Person person1 = new Person();
        Person person2 = new Person("Thomas", "Wang", 17);
        /*
        // getters
        System.out.println("----------------------------");
        System.out.println("Person 1 First Name: " + person1.getFirstName());
        System.out.println("Person 1 Last Name: " + person1.getLastName());
        System.out.println("Person 1 Age: " + person1.getAge());
        System.out.println("Person 2 First Name: " + person2.getFirstName());
        System.out.println("Person 2 Last Name: " + person2.getLastName());
        System.out.println("Person 2 Age: " + person2.getAge());

        // setters
        System.out.println("----------------------------");
        System.out.println("4 years have passed");
        person1.ageByYears(4);
        person2.ageByYears(4);
        System.out.println("Person 1 New Age: " + person1.getAge());
        System.out.println("Person 2 New Age: " + person2.getAge());
        System.out.println("Person 1 wanted to change their name");
        person1.setFirstName(person2.getFirstName());
        person1.setLastName(person2.getLastName());
        System.out.println("Person 1 First Name: " + person1.getFirstName());
        System.out.println("Person 1 Last Name: " + person1.getLastName());
        System.out.println("Person 2 First Name: " + person2.getFirstName());
        System.out.println("Person 2 Last Name: " + person2.getLastName());

        // other methods
        person1.eat();
        person2.eat();
        person1.sleep(5);
        person2.sleep(3);
        //person1.ageByYears(4);
        //person2.ageByYears(15);
        person1.ageByYearsAndPrint(4);
        person2.ageByYearsAndPrint(15);
        */
        System.out.println(person1);
        System.out.println(person2);
    }

}