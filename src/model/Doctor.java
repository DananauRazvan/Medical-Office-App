package model;

import java.util.Scanner;

public class Doctor extends HealthcareProfessional {
    private String specialization;
    private int noResidents;

    public Doctor() {

    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setNoResidents(int noResidents) {
        this.noResidents = noResidents;
    }

    public void setter() {
        super.setter();

        Scanner objString = new Scanner(System.in);
        Scanner objInt = new Scanner(System.in);

        System.out.print("Medical specialization = ");
        String specialization = objString.nextLine();
        this.specialization = specialization;

        System.out.print("Number of residents = ");
        int noResidednts = objInt.nextInt();
        this.noResidents = noResidednts;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getNoResidents() {
        return noResidents;
    }

    public void show() {
        super.show();

        System.out.println("Medical specialization = " + specialization);
        System.out.println("Number of residents = " + noResidents);
    }
}
