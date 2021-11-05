package com.ganeevrm.person;

import com.ganeevrm.Timetable;

public class Doctor extends Person {
    private Timetable timetable;

    public Doctor (String firstName, String surname, Timetable timetable){
        setFirstName(firstName);
        setSurname(surname);
        this.timetable = timetable;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    @Override
    public String toString() {
        return "Врач - " + getFirstName() + " " + getSurname();
    }
}
