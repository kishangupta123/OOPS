package OOPS;

/* Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor,
and print their name and age.*/

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Person person1 = new Person("Kishan", 24);
        Person person2 = new Person("Ishita", 23);

        System.out.println(person1.getName() + " age is " + person1.getAge());
        System.out.println(person2.getName() + " age is " + person2.getAge());

        person1.setAge(25);


        person2.setName("Ishita Saxena");
        person2.setAge(26);

        System.out.println("New age and name is: ");

        System.out.println(person1.getName() + " age is now " + person1.getAge());
        System.out.println(person2.getName() + " age is now " + person2.getAge());

    }
}