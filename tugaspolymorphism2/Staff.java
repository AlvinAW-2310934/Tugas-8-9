package com.mycompany.tugaspolymorphism2;

/**
 *
 * @author alvin
 */
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email,
                 String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    public String toString() {
        return "Class: Staff, Name: " + name + ", Title: " + title + ", Office: " + office + ", Salary: " + salary + ", Hired: " + dateHired + ", Address: " + address + ", Phone: " + phoneNumber + ", Email: " + email;
    }
}
