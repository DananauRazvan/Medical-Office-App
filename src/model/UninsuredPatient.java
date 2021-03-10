package model;

import java.util.Scanner;

public class UninsuredPatient extends Patient {
    public float monthlyIncome;

    public UninsuredPatient() {

    }

    public void setMonthlyIncome(float monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public void setter() {
        super.setter();

        Scanner objFloat = new Scanner(System.in);

        System.out.print("Monthly income: ");
        float monthlyIncome = objFloat.nextFloat();
        this.monthlyIncome = monthlyIncome;
    }

    public float getMonthlyIncome() {
        return monthlyIncome;
    }

    public void show() {
        super.show();

        System.out.println("Monthly income: " + monthlyIncome);
    }

    public float monthlyPayments() {
        return monthlyIncome / 5;
    }

    public String paymentsCompletionDate() {
        String date1 = booking.charAt(0) + "" + booking.charAt(1);
        String date2 = booking.charAt(3) + "" + booking.charAt(4);
        String date3 = booking.charAt(6) + "" + booking.charAt(7) + "" + booking.charAt(8) + "" + booking.charAt(9);

        int x = Integer.parseInt(date2);
        if (x <= 7) {
            x += 5;
            if (x < 10)
                return date1 + ".0" + String.valueOf(x) + "." + date3;
            return date1 + "." + String.valueOf(x) + "." + date3;
        }
        x = (x + 5) % 12;
        int y = Integer.parseInt(date3);
        y++;
        return date1 + ".0" + String.valueOf(x) + "." + String.valueOf(y);

    }
}
