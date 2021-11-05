package com.ganeevrm.person;

import com.ganeevrm.Card;
import com.ganeevrm.person.Person;

public class Patient extends Person {
    private Card card;

    public Patient (String firstName, String surname, Card card){
        setFirstName(firstName);
        setSurname(surname);
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Пациент - " + getFirstName() + " " + getSurname();
    }
}
