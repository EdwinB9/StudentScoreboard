/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.grades;

import java.time.LocalDate;

/**
 *
 * @author Edwin
 */
public class Grades {

    private float note;
    private LocalDate dateAssigned;

    public Grades(float note, LocalDate dateAssigned) {
        this.note = note;
        this.dateAssigned = dateAssigned;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public LocalDate getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(LocalDate dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

}
