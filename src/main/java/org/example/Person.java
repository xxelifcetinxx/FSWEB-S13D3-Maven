package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    // Ekstra özellikler
    private String gender;
    private String email;
    private boolean isEmployed;

    // Constructor 1
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor 2 - Overloading + Chaining
    public Person(String firstName, String lastName, int age, String gender, String email, boolean isEmployed) {
        this(firstName, lastName, age); // constructor chaining
        this.gender = gender;
        this.email = email;
        this.isEmployed = isEmployed;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
