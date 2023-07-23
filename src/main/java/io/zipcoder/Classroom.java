package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

    private Student[] students;

    public Classroom(int maxNumOfStudents) {
        this.students = new Student[maxNumOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        double sum = 0;
        for (Student s : students) {
            sum += s.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student) {
        int nullInd = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                nullInd = i;
                break;
            }
        }
        if (nullInd >= 0) {
            students[nullInd] = student;
        } else {
            Student[] newStudentArray = Arrays.copyOf(students, students.length + 1);
            newStudentArray[students.length] = student;
            students = newStudentArray;
        }
    }

    public void removeStudent(String firstName, String lastName) {
        int nullInd = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equalsIgnoreCase(firstName) && students[i].getLastName().equalsIgnoreCase(lastName)) {
                nullInd = i;
                students[i] = null;
                break;
            }
        }
        for (int i = nullInd + 1; i < students.length; i++) {
            if (students[i - 1] == null) {
                students[i - 1] = students[i];
                students[i] = null;
            }
        }

    }

}
