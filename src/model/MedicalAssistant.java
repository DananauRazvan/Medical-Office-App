package model;

import model.HealthcareProfessional;

import java.util.Scanner;

public class MedicalAssistant extends HealthcareProfessional {
    private int noPatients;

    public MedicalAssistant() {

    }

    public void setNoPatients(int noPatients) {
        this.noPatients = noPatients;
    }

    public void setter() {
        super.setter();

        Scanner objInt = new Scanner(System.in);

        System.out.print("Number of patients: ");
        int noPatients = objInt.nextInt();
        this.noPatients = noPatients;
    }

    public int getNoPatients() {
        return noPatients;
    }

    public void show() {
        super.show();

        System.out.println("Number of patients: " + noPatients);
    }
}
