package org.example.EqualsExample;

public class EqualsExample {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Smith");
        Person person3 = new Person("John", "Doe");

        // Porównujemy obiekty klasy Person na podstawie zawartości ich pól
        boolean areEqual1And2 = person1.equals(person2); // false
        boolean areEqual1And3 = person1.equals(person3); // true

        System.out.println("Czy person1 jest równy person2? " + areEqual1And2);
        System.out.println("Czy person1 jest równy person3? " + areEqual1And3);
    }
}
