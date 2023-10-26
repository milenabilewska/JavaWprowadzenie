package org.example.HashCodeExample;

import java.util.HashMap;

public class HashCodeExample {
    public static void main(String[] args) {
        HashMap<Person, String> personMap = new HashMap<>();

        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Smith");

        personMap.put(person1, "Employee");
        personMap.put(person2, "Manager");

        // Teraz możemy uzyskać dostęp do informacji o osobach na podstawie ich kodów skrótu
        Person lookupPerson = new Person("John", "Doe");
        String role = personMap.get(lookupPerson);

        System.out.println("Rola osoby: " + role);
    }
}
