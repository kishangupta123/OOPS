package OOPS;

/*
 * Write a Java program to create a class called "Dog" with a name and breed attribute.
 * Create two instances of the "Dog" class, set their attributes using the constructor
 * and modify the attributes using the setter methods and print the updated values.
 * */

class Dog {
    String name, breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Program2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("LOKI", "Labrador");
        Dog d2 = new Dog("Simba", "Husky");

        System.out.println("The name of the dog is: " + d1.getName() + " and the breed is: " + d1.getBreed());
        System.out.println("The name of the dog is: " + d2.getName() + " and the breed is: " + d2.getBreed());

        d1.setName("Mimba");
        d1.setBreed("Lumba");

        d2.setName("Mia");
        d2.setBreed("Khalifa");

        System.out.println("The updated value is : ");

        System.out.println("The name of the dog is: " + d1.getName() + " and the breed is: " + d1.getBreed());
        System.out.println("The name of the dog is: " + d2.getName() + " and the breed is: " + d2.getBreed());
    }
}
