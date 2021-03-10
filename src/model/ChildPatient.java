package model;

import java.util.Scanner;

public class ChildPatient extends Patient {
    private String firstNameFather;
    private String firstNameMother;
    private String schoolName;

    public ChildPatient() {

    }

    public void setFirstNameFather(String firstNameFather) {
        this.firstNameFather = firstNameFather;
    }

    public void setFirstNameMother(String firstNameMother) {
        this.firstNameMother = firstNameMother;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setter() {
        super.setter();

        Scanner objString = new Scanner(System.in);

        System.out.print("Father's first name: ");
        String firstNameFather = objString.nextLine();
        this.firstNameFather = firstNameFather;

        System.out.print("Mother's first name: ");
        String firstNameMother = objString.nextLine();
        this.firstNameMother = firstNameMother;

        System.out.print("Child's school: ");
        String schoolName = objString.nextLine();
        this.schoolName = schoolName;
    }

    public String getFirstNameFather() {
        return firstNameFather;
    }

    public String getFirstNameMother() {
        return firstNameMother;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void show() {
        super.show();

        System.out.println("Father's first name: " + firstNameFather);
        System.out.println("Mother's first name: " + firstNameMother);
        System.out.println("Child's school: " + schoolName);
    }
}
