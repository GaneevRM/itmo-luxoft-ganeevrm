package com.ganeevrm;

import com.ganeevrm.person.Doctor;
import com.ganeevrm.person.Patient;

public class Main {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Виктор", "Круглов", new Timetable());
        Doctor doctor2 = new Doctor("Лариса", "Коротких", new Timetable());
        Patient patient = new Patient("Мария", "Сорокина", new Card("12.07.2023", doctor));
        Patient patient2 = new Patient("Игорь", "Мишкин", new Card("25.09.2023", doctor2));


        System.out.println(patient);
        System.out.println(patient.getCard());
        System.out.println(patient.getCard().getDoctor());

        System.out.println("------------------------------------------------------");

        System.out.println(patient2);
        System.out.println(patient2.getCard());
        System.out.println(patient2.getCard().getDoctor());
    }
}
