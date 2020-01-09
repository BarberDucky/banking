package com.planit.banking;

public class Customer {
    private int id;
    private String firstName, lastName, nationality, occupation;
    private short age;

    public Customer(int id, String firstName, String lastName, String nationality, String occupation, short age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.occupation = occupation;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }
}
