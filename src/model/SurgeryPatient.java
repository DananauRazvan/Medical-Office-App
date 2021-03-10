package model;

import java.util.Scanner;

public class SurgeryPatient extends Patient {
    private String surgeryDate;
    private int surgeryEstimatedTime;
    private int recoveryDays;

    SurgeryPatient() {

    }

    public void setSurgeryDate(String surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public void setSurgeryEstimatedTime(int surgeryEstimatedTime) {
        this.surgeryEstimatedTime = surgeryEstimatedTime;
    }

    public void setRecoveryDays(int recoveryDays) {
        this.recoveryDays = recoveryDays;
    }

    public void setter() {
        super.setter();

        Scanner objString = new Scanner(System.in);
        Scanner objInt = new Scanner(System.in);

        System.out.print("Surgery date: ");
        String surgeryDate = objString.nextLine();
        this.surgeryDate = surgeryDate;

        System.out.print("Surgery estimated time in minutes: ");
        int surgeryEstimatedTime = objInt.nextInt();
        this.surgeryEstimatedTime = surgeryEstimatedTime;

        System.out.print("Recovery days after surgery: ");
        int recoveryDays = objInt.nextInt();
        this.recoveryDays = recoveryDays;
    }

    public String getSurgeryDate() {
        return surgeryDate;
    }

    public int getSurgeryEstimatedTime() {
        return surgeryEstimatedTime;
    }

    public int getRecoveryDays() {
        return recoveryDays;
    }

    public void show() {
        super.show();

        System.out.println("Surgery date: " + surgeryDate);
        System.out.println("Surgery estimated time in minutes: " + surgeryEstimatedTime);
        System.out.println("Recovery days after surgery: " + recoveryDays);
    }
}
