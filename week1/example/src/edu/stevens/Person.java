package edu.stevens;

/* Person
-name: String
-age:int
+Person(initialName:String)
+printPerson():void
+getName():String
*/

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 20;
    }

    public void printPerson(){
        System.out.println("The name of this person is " + this.name + "and age is" + this.age);
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Person person1 = new Person("mengjiao");
        person1.printPerson();
        System.out.println(person1.getName());
    }

}
