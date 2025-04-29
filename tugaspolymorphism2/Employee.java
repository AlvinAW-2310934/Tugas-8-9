package com.mycompany.tugaspolymorphism2;

/**
 *
 * @author alvin
 */
class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email,
                    String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Class: Employee, Name: " + name + ", Office: " + office + ", Salary: " + salary + ", Hired: " + dateHired;
    }
}
