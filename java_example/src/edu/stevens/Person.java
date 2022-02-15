package edu.stevens;

public class Person {
    // data fields
    /* the person's age: instance variable */
    private int age;
    /* the person's firstName: instance variable */
    private String firstName;
    /* the person's lastName: instance variable */
    private String lastName;
    /* the person's IDNumber: instance variable */
    private String IDNumber;

    /* # persons = static variable */
    private static int person_number=0;
    /* The age at which a person can vote */
    private static final int VOTE_AGE = 18;

    /* constructor method1 */
    public Person(String firstName, String lastName, int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        Person.person_number++;
    }

    /* constructor method2 */
    public Person(String firstName, String lastName, int age, String ID) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = ID;
        Person.person_number++;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIDNumber(String ID) {
        return this.IDNumber;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public boolean canVote() {
//        VOTE_AGE = 19;
//        Error! cannot assign a value to a final variable
//        return (currentYear-birthYear >= VOTE_AGE);
        if (this.age >= VOTE_AGE) {
            return true;
        } else {
            return false;
        }
    }

    public Person clone() {
        Person new_person = new Person(this.firstName, this.lastName,
                                       this.age, this.IDNumber);
        return new_person;
    }

    public static void main(String[] args) {
        System.out.println(Person.VOTE_AGE);
        Person sam = new Person("Sam","Jones", 20);
        Person sue = new Person("Sue", "Jones",
                                 17, "0001");
        System.out.println("The ID number of "+ sue.getName() + " is " + sue.IDNumber);
        System.out.println("Age of " + sue.getName() + " is " + sue.getAge());
//        System.out.println(Person.person_number);
//        System.out.println(sam);
//        if (sue.canVote()) {
//            System.out.println(sue.getName() + " can vote");
//        } else {
//            System.out.println(sue.getName() + " cannot vote");
//        }
//
//        Person sue1 = sue;
//        System.out.println(sue);
//        System.out.println(sue1);
//
//        Person sue2 = sue.clone();
//        System.out.println(sue2);
//
//        System.out.println(sue.age);
//        sue.setAge(27);
//        System.out.println(sue.age);
//        System.out.println(sue1.age);
//        System.out.println(sue2.age);

    }

}
