package model;

import java.util.Scanner;

public class Patient extends Person {
    private String lastControl;
    private boolean sick;
    private String city;
    private String booking;

    public Patient() {

    }

    public void setLastControl(String lastControl) {
        this.lastControl = lastControl;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public void setter() {
        super.setter();

        Scanner objString = new Scanner(System.in);
        Scanner objBoolean = new Scanner(System.in);

        System.out.print("Date of the last control = ");
        String lastControl = objString.nextLine();
        this.lastControl = lastControl;

        System.out.print("Sick = ");
        boolean sick = objBoolean.nextBoolean();
        this.sick = sick;

        System.out.print("City = ");
        String city = objString.nextLine();
        this.city = city;

        System.out.print("Booking date = ");
        String booking = objString.nextLine();
        this.booking = booking;
    }

    public String getLastControl() {
        return lastControl;
    }

    public boolean getSick() {
        return sick;
    }

    public String getCity() {
        return city;
    }

    public String getBooking() {
        return booking;
    }

    public void show() {
        super.show();

        System.out.println("Date of the last control = " + lastControl);
        System.out.println("Sick = " + sick);
        System.out.println("City = " + city);
        System.out.println("Booking date = " + booking);
    }
}
