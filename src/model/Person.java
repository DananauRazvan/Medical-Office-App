package model;

import java.util.Scanner;

public abstract class Person {
    private static int id = 0;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String phoneNumber;
    private String address;

    public Person() {

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setter() {
        Scanner objString = new Scanner(System.in);
        Scanner objInt = new Scanner(System.in);

        id++;

        System.out.print("First name: ");
        String firstName = objString.nextLine();
        this.firstName = firstName;

        System.out.print("Last name: ");
        String lastName = objString.nextLine();
        this.lastName = lastName;

        System.out.print("Age: ");
        int age = objInt.nextInt();
        this.age = age;

        System.out.print("Gender: ");
        String gender = objString.nextLine();
        this.gender = gender;

        System.out.print("Phone number: ");
        String phoneNumber  = objString.nextLine();
        this.phoneNumber = phoneNumber;

        System.out.print("Address: ");
        String address = objString.nextLine();
        this.address = address;
    }

    public int getId() {
        return id;
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

    public String getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void show() {
        System.out.println("Id: " + id);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber);
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
}
