import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.00, 150.00, 250.00, 0.00 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        //student.addExamScore(100.0);
        //student.addExamScore(105.0);

        String output = student.getExamScores();
        Double average = student.getAverageExamScore();

        // Then
        System.out.println(output);
        System.out.println(average );

        String output2 = student.toString();

        // Then
        System.out.println(output2);

        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        Double  output3 = classroom.getAverageExamScore();

        // Then
        System.out.println((output3));

        // : Given
        int maxNumberOfStudents = 1;
        Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };

        Double[] examScores2 = { 100.5, 150.5, 250.5, 0.5 };


        Student student1 = new Student("Leon", "Hunter", examScores1);
        Student student12 = new Student("Leon", "Hunters", examScores2);

        Classroom classroom1 = new Classroom(new Student[]{student1, student12});

        //classroom1.removeStudent("Leon", "Hunters");

        classroom1.getStudentsByScore();
        classroom.getGradeBook();



        // When
        Student[] preEnrollment = classroom1.getStudents();
        classroom1.addStudent(student1);
        classroom1.addStudent(student12);

        Student[] postEnrollment = classroom1.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);




      }
}
