package main;

import java.util.Scanner;
import model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MedicalOffice X = new MedicalOffice();

        int opt;

        do {
            System.out.println("1. Add objects");
            System.out.println("2. The database of healthcare professionals");
            System.out.println("3. The database of patients");
            System.out.println("4. Doctor's specializations");
            System.out.println("5. Healthcare professionals's salaries");
            System.out.println("6. Healthcare professionals with over 10 years experience");
            System.out.println("7. Sick patients at last control");
            System.out.println("8. Healty patients at last control");
            System.out.println("9. Patients from Bucharest");
            System.out.println("10. Patients who are not from Bucharest");
            System.out.println("11. Male patients");
            System.out.println("12. Female patients");
            System.out.println("13. Smoking patients with heart diseases");
            System.out.println("14. The names of the child patients");
            System.out.println("15. The parents name's of a child patient");
            System.out.println("16. Patients's last control");
            System.out.println("17. Patients who requires surgery");
            System.out.println("18. The uninsured patients monthly payments and ending date");
            System.out.println("19. Exit");

            System.out.println();
            System.out.print("Your option: ");
            Scanner obj = new Scanner(System.in);
            opt = obj.nextInt();

            switch (opt) {
                case 1:
                    X.addObject();
                    break;
                case 2:
                    X.databaseHP();
                    break;
                case 3:
                    X.databaseP();
                    break;
                case 4:
                    X.docSpecialization();
                    break;
                case 5:
                    X.healthcareProfessionalsSalaries();
                    break;
                case 6:
                    X.healthcareProfessionals10YearsExp();
                    break;
                case 7:
                    X.sickPatients();
                    break;
                case 8:
                    X.healthyPatients();
                    break;
                case 9:
                    X.patientsBucharest();
                    break;
                case 10:
                    X.patientsNotFromBucharest();
                    break;
                case 11:
                    X.malePatients();
                    break;
                case 12:
                    X.femalePatients();
                    break;
                case 13:
                    X.smokingPatientsDiseases();
                    break;
                case 14:
                    X.namesChildPatients();
                    break;
                case 15:
                    X.parentsNamesChildPatients();
                    break;
                case 16:
                    X.patientsLastControl();
                    break;
                case 17:
                    X.patientsRequiringSurgery();
                    break;
                case 18:
                    X.uninsuredPatientsMonthyPayments();
                    break;
            }

        } while(opt != 19);
    }
}