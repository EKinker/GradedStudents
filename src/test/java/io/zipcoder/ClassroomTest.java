package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

@Test
        public void test() {
    // : Given
    // : Given
    int maxNumberOfStudents = 2;
    Classroom classroom = new Classroom(maxNumberOfStudents);
    Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
    Student student = new Student("Leon", "Hunter", examScores);
    Student student1 = new Student("a", "b", examScores);
    Student student2 = new Student("Lisa", "Simpson", examScores);
    classroom.addStudent(student);
    classroom.addStudent(student1);
    classroom.addStudent(student2);

    classroom.removeStudent("Leon", "Hunter");
    classroom.removeStudent("Lisa", "Simpson");
    System.out.println(classroom.getStudents().length);
    System.out.println(Arrays.toString(classroom.getStudents()));

}
}
