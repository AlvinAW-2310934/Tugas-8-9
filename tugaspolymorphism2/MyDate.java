package com.mycompany.tugaspolymorphism2;

/**
 *
 * @author alvin
 */
class MyDate {
    private int year, month, day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }
}