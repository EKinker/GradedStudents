package io.zipcoder;

import java.util.Arrays;
import java.util.List;

public class Student {



    String firstName;

    String lastName;
    List<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = Arrays.asList(testScores);

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
    public List<Double> getExamScores(){
        return examScores;
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }
}
