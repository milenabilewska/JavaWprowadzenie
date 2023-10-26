package org.example.HashCodeExample;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int result = 17; // Wartość startowa
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person otherPerson = (Person) obj;

        return firstName.equals(otherPerson.firstName) && lastName.equals(otherPerson.lastName);
    }
}
