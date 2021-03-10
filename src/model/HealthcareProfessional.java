package model;

import java.util.Scanner;

public abstract class HealthcareProfessional extends Person {
    private int experience;
    private int startYear;
    private float salary;
    private String medicalOfficeName;

    public HealthcareProfessional() {

    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setMedicalOfficeName(String medicalOfficeName) {
        this.medicalOfficeName = medicalOfficeName;
    }

    public void setter() {
        super.setter();

        Scanner objInt = new Scanner(System.in);
        Scanner objFloat = new Scanner(System.in);
        Scanner objString = new Scanner(System.in);

        System.out.print("Experience: ");
        int experience = objInt.nextInt();
        this.experience = experience;

        System.out.print("Start year: ");
        int startYear = objInt.nextInt();
        this.startYear = startYear;

        System.out.print("Salary: ");
        float salary = objFloat.nextFloat();
        this.salary = salary;

        System.out.print("Medical office name: ");
        String medicalOfficeName = objString.nextLine();
        this.medicalOfficeName = medicalOfficeName;
    }

    public int getExperience() {
        return experience;
    }

    public int getStartYear() {
        return  startYear;
    }

    public float getSalary() {
        return  salary;
    }

    public String getMedicalOfficeName(){
        return  medicalOfficeName;
    }

    public void show(){
        super.show();

        System.out.println("Experience: " + experience);
        System.out.println("Starting year: " + startYear);
        System.out.println("Salary: " + salary);
        System.out.println("Medical office name: " + medicalOfficeName);
    }
}
