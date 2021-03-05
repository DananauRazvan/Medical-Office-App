package model;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class MedicalOffice {
    private ArrayList<Person> arr = new ArrayList<Person>();
    private TreeMap<String, String> bookings = new TreeMap<String, String>();

    public void addObject() {
        Scanner obj = new Scanner(System.in);

        System.out.println("Add an object :");

        System.out.println("1. Add a Medical Assistant");
        System.out.println("2. Add a Doctor");
        System.out.println("3. Add a Patient");
        System.out.println("4. Add a Smoking Patient");
        System.out.println("5. Add a Child Patient");

        System.out.print("Your answear = ");
        int x = obj.nextInt();
        Person p;
        switch (x) {
            case 1:
                p = new MedicalAssistant();
                p.setter();
                arr.add(p);
                break;
            case 2:
                p = new Doctor();
                p.setter();
                arr.add(p);
                break;
            case 3:
                p = new Patient();
                p.setter();
                arr.add(p);
                bookings.put(((Patient)(p)).fullName(), ((Patient)(p)).getBooking());
                break;
            case 4:
                p = new SmokingPatient();
                p.setter();
                arr.add(p);
                bookings.put(((SmokingPatient)(p)).fullName(), ((SmokingPatient)(p)).getBooking());
                break;
            case 5:
                p = new ChildPatient();
                p.setter();
                arr.add(p);
                bookings.put(((ChildPatient)(p)).fullName(), ((ChildPatient)(p)).getBooking());
                break;
        }
    }

    public void databaseHP() {
        System.out.println("The database of healthcare professionals : ");
        for (var it : arr)
            if (it instanceof HealthcareProfessional)
                it.show();
    }

    public void databaseP() {
        System.out.println("The database of patients : ");
        for (var it : arr)
            if (it instanceof Patient)
                it.show();
    }

    public void docSpecialization() {
        System.out.println("Doctor's specializations : ");
        for (var it : arr)
            if (it instanceof Doctor)
                System.out.println(it.getFirstName() + " " + it.getLastName() + " " + ((Doctor) it).getSpecialization());
    }

    public void healthcareProfessionalsSalaries() {
        System.out.println("Healthcare professionals's salaries : ");
        for (var it : arr)
            if (it instanceof HealthcareProfessional)
                System.out.print(it.getFirstName() + " " + it.getLastName() + ((HealthcareProfessional) it).getSalary());
    }

    public void healthcareProfessionals10YearsExp() {
        System.out.println("Healthcare professionals with over 10 years experience :");
        for (var it : arr)
            if (it instanceof HealthcareProfessional)
                System.out.println(it.getFirstName() + " " + it.getLastName() + " " + ((HealthcareProfessional) it).getExperience());
    }
    public void sickPatients() {
        System.out.println("Sick patients at last control :");
        for(var it : arr)
            if (it instanceof Patient)
                if (((Patient) it).getSick() == true)
                    System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge() + " " + ((Patient) it).getLastControl());
    }

    public void healthyPatients() {
        System.out.println("Healty patients at last control :");
        for (var it : arr)
            if(it instanceof Patient)
                if (((Patient) it).getSick() == false)
                    System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge() + " " + ((Patient) it).getLastControl());
    }

    public void patientsBucharest() {
        System.out.println("Patients from Bucharest :");
        for (var it : arr)
            if (it instanceof Patient)
                if (((Patient) it).getCity() == "Bucharest")
                    System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge());
    }

    public void patientsNotFromBucharest() {
        System.out.println("Patients who are not from Bucharest :");
        for (var it : arr)
            if (it instanceof Patient)
                if (((Patient) it).getCity() != "Bucharest")
                    System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge());
    }

    public void malePatients() {
        System.out.println("Male patients :");
        for (var it : arr)
            if(it instanceof Patient)
                if (it.getGender() == "Male")
                    System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge());
    }

    public void femalePatients() {
        System.out.println("Female patients :");
        for (var it : arr)
            if(it instanceof Patient)
                if (it.getGender() == "Female")
                    System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge());
    }

    public void smokingPatientsDiseases() {
        System.out.println("Smoking patients with heart diseases");
        for (var it : arr)
            if (it instanceof SmokingPatient)
                if (((SmokingPatient) it).getHeartDiseases() == true)
                    System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge());
    }

    public void namesChildPatients() {
        System.out.println("The names of the child patients :");
        for (var it : arr)
            if (it instanceof ChildPatient)
                System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge());
    }

    public void parentsNamesChildPatients() {
        System.out.println("The parents name's of a child patient");
        for (var it : arr)
            if (it instanceof ChildPatient)
                System.out.println(it.getFirstName() + " " + it.getLastName() + " - " + ((ChildPatient) it).getFirstNameFather() + ", " + ((ChildPatient) it).getFirstNameMother());
    }

    public void patientsLastControl() {
        System.out.println("Patients's last control :");
        for (var it : arr)
            if (it instanceof Patient)
                System.out.println(it.getFirstName() + " " + it.getLastName() + " " + it.getAge());
    }
}