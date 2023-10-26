package org.example.EqualsExample;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person otherPerson = (Person) obj;

        return firstName.equals(otherPerson.firstName) && lastName.equals(otherPerson.lastName);
    }
}
