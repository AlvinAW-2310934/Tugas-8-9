package com.mycompany.tugaspolymorphism2;

/**
 *
 * @author alvin
 */
class Person {
    protected String name, address, phoneNumber, email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Class: Person, Name: " + name + ", Address: " + address + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}
