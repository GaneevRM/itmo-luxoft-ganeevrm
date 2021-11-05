package com.ganeevrm;

import com.ganeevrm.person.Doctor;

public class Card {
    private static int number;
    private int numberCard;
    private String date;
    private Doctor doctor;

    public Card(String date, Doctor doctor){
        setNumberCard(number++);
        setDate(date);
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    @Override
    public String toString() {
        return "Карта - №" + getNumberCard() + ". " + "Дата оформления - " + getDate();
    }
}
