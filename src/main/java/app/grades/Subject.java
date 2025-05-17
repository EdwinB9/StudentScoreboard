/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.grades;

/**
 *
 * @author Edwin
 */
public class Subject {

    private String name;
    private Grades[] grades;

    public Subject(String name, Grades[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grades[] getGrades() {
        return grades;
    }

    public void setGrades(Grades[] grades) {
        this.grades = grades;
    }

}
