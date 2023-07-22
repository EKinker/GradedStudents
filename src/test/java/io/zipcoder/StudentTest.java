package io.zipcoder;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetExamScores(){
        String firstName = "Arthur";
        String lastName = "Dent";
        Double[] examScores = {75.0, 83.0, 89.0};
        Student student = new Student(firstName, lastName, examScores);

       // String output = student.getExamScores();
        //System.out.println(output);
        student.addExamScore(100.00);
//        System.out.println(student.getExamScores());
//        System.out.println(student.getNumberOfExamsTaken());

        student.setExamScores(1,500);
//        System.out.println(student.getExamScores());
//        System.out.println(student.getAverageExamScore());
        System.out.println(student.toString());

    }

}