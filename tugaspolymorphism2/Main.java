package com.mycompany.tugaspolymorphism2;

/**
 *
 * @author alvin
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alvin", "Bandung", "081234567", "alvin@mail.com");
        Student student = new Student("Nopal", "Batang", "082345678", "nopal@mail.com", Student.JUNIOR);
        Employee employee = new Employee("Syahrul", "Bekasi", "083456789", "syahrul@mail.com", "A101", 7000.0, new MyDate(2020, 5, 10));
        Faculty faculty = new Faculty("Ali", "Tangerang", "084567890", "ali@mail.com", "B202", 8500.0, new MyDate(2019, 3, 20), 10, "Professor");
        Staff staff = new Staff("Ridho", "Jambi", "085678901", "ridho@mail.com", "C303", 6000.0, new MyDate(2021, 7, 15), "Admin");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
