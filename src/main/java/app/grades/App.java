/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.grades;

import java.time.LocalDate;

/**
 *
 * @author Edwin
 */
public class App {
    
    public static void Demo() {
        Grades[] mathGrades = {
            new Grades(5, LocalDate.now())
        };

        Subject[] subjects = {
            new Subject("Math", mathGrades)
        };
        
        Student student = new Student("Cristian", subjects);
        System.out.println(student);
    }

    public static void main(String[] args) {
        System.out.println("StudentScoreboard App!");
        App.Demo();
    }
}
