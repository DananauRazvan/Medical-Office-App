package model;

import model.Patient;

import java.util.Scanner;

public class SmokingPatient extends Patient {
    private int yearsOfSmoking;
    private boolean heartDiseases;

    public SmokingPatient() {

    }

    public void setYearsOfSmoking(int yearsOfSmoking) {
        this.yearsOfSmoking = yearsOfSmoking;
    }

    public void setHeartDisease(boolean heartDiseases) {
        this.heartDiseases = heartDiseases;
    }

    public void setter() {
        super.setter();

        Scanner objInt = new Scanner(System.in);
        Scanner objBoolean = new Scanner(System.in);

        System.out.print("Years of smoking = ");
        int yearsOfSmoking = objInt.nextInt();
        this.yearsOfSmoking = yearsOfSmoking;

        System.out.print("Heart diseases = ");
        Boolean heartDisease = objBoolean.nextBoolean();
        this.heartDiseases = heartDiseases;
    }

    public int getYearsOfSmoking() {
        return yearsOfSmoking;
    }

    public boolean getHeartDiseases() {
        return heartDiseases;
    }

    public void show() {
        super.show();

        System.out.println("Years of smoking = " + yearsOfSmoking);
        System.out.println("Heart diseases = " + heartDiseases);
    }
}
