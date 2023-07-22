package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {


    String firstName;

    String lastName;
    List<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList(Arrays.asList(testScores));

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        StringBuilder sb = new StringBuilder();
        sb.append("Exam Scores:\n");
        for (Double d : examScores) {
            sb.append(String.format("%9s %d -> %.0f\n", "Exam", (examScores.indexOf((d)) + 1), d));
        }
        return sb.toString();
    }

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScores(int examNum, double examScore) {
        examScores.set(examNum - 1, examScore);
    }

    public double getAverageExamScore() {
        double sum = 0;
        for (double d : examScores) {
            sum += d;
        }

        return sum / examScores.size();
    }

    @Override
        public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Student Name: %s %s\n> Average Score: %.0f\n>",
                firstName, lastName, getAverageExamScore()));
        sb.append(getExamScores());

        return sb.toString();
    }



}
