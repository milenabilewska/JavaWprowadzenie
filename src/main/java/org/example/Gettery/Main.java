package org.example.Gettery;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 30);
        String firstName = person.getFirstName();
        String lastName = person.getLastName();
        int age = person.getAge();
        System.out.println(age);

        //m,mmm.lkn
    }
}
