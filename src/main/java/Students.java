import java.util.Arrays;

public class Students {
    public static void main(String[] args) {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.00, 150.00, 250.00, 0.00 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        //student.addExamScore(100.0);
        //student.addExamScore(105.0);

        //When
        String output = student.getExamScores(); //   setting the getExamScores method to a String named output
        //When
        Double average = student.getAverageExamScore();// //  setting the getAverageExamScore method to a String named average

        // Then
        System.out.println(output);// printing the "output" aka .getExamScores
        //Then
        System.out.println(average);// printing out "average" aka  .getAverageScores

        String output2 = student.toString();// printing out the second student

        // Then
        System.out.println(output2);// printing out the second students "output" aka .getExamScores

        // : Given
        Double[] s1Scores = { 100.0, 150.0 };// test scores from the 1st student
        Double[] s2Scores = { 225.0, 25.0 };// test scores from the second student

        Student s1 = new Student("student", "one", s1Scores);// assigning student 1 his test scores
        Student s2 = new Student("student", "two", s2Scores);// assigning student 2 his test scores

        Student[] students = {s1,s2};// putting both students in to array
        Classroom classroom = new Classroom(students);// adding students to the classroom class

        // When
        Double  output3 = classroom.getAverageExamScore();

        // Then
        System.out.println((output3));// getting the average exam score

        // : Given
        int maxNumberOfStudents = 1;
        Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };// testScores for student one

        Double[] examScores2 = { 100.5, 150.5, 250.5, 0.5 };// testScores for student 2


        Student student1 = new Student("Leon", "Hunter", examScores1);// making a new student
        Student student12 = new Student("Leon", "Hunters", examScores2);//making a 2nd new student

        Classroom classroom1 = new Classroom(new Student[]{student1, student12});// putting the students into an array

        classroom1.removeStudent("Leon", "Hunters");// removing student Leon Hunters

        classroom1.getStudentsByScore();// calling the method
        classroom.getGradeBook();//getting all grades



        // When
        Student[] preEnrollment = classroom1.getStudents();//who is in classroom one and storing them in pre-enrollment
        classroom1.addStudent(student1); // adding new student 1
        classroom1.addStudent(student12);// adding new student 12

        Student[] postEnrollment = classroom1.getStudents();//checking to see students 1 and 12 made it into the classroom

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);//seeing if there are any students in the classroom and put them in a string format
        String postEnrollmentAsString = Arrays.toString(postEnrollment); // adding two new students and put them in a string format

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);// checking if students were in the classroom
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);//checking if the students are in the classroom after adding two students




      }
}
