package com.mycompany.tugaspolymorphism2;

/**
 *
 * @author alvin
 */
class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email,
                   String office, double salary, MyDate dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return "Class: Faculty, Name: " + name + ", Rank: " + rank + ", Office Hours: " + officeHours + ", Office: " + office + ", Email: " + email;
    }
}
    