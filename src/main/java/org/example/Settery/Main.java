package org.example.Settery;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 30);
        // Ustawiamy nowe wartości pól za pomocą setterów
        person.setFirstName("Jane");
        person.setLastName("Smith");
        person.setAge(35);


    }
}
