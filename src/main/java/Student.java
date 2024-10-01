import java.util.Arrays;

public class Students {
    public static void main(String[] args) {
//        Part 1
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        //1.2
        Student student = new Student(firstName, lastName, examScores);
//1.3
        // When
        String output = student.getExamScores();//   setting the getExamScores method to a String named output

        // Then
        System.out.println(output);// printing the "output" aka .getExamScores
//1.4
        // : Given
        String firstName1 = "Leon";
        String lastName1 = "Hunter";
        Double[] examScores1 = { };
        Student student1 = new Student(firstName1, lastName1, examScores1);

        // When
        student1.addExamScore(100.0);
        String output1 = student.getExamScores();//   setting the getExamScores method to a String named output1

        // Then
        System.out.println(output1); //printing out result
//1.5
        // : Given
        String firstName2 = "Leon";
        String lastName2 = "Hunter";
        Double[] examScores2 = { 100.0 };
        Student student2 = new Student(firstName2, lastName2, examScores2);

        // When
        student2.setExamScore(1, 150.0);
        String output2 = student2.getExamScores();// adding new score

        // Then
        System.out.println(output2);// printing new score
//1.6
        // : Given
        String firstName3 = "Leon";
        String lastName3 = "Hunter";
        Double[] examScores3 = { 100.0, 150.0, 250.0, 0.0 };
        Student student3 = new Student(firstName3, lastName3, examScores3);

        // When
        Double output3 = student3.getAverageExamScore();//getting average score

        // Then
        System.out.println(output3);//printing average
//1.7
        // : Given
        String firstName4 = "Leon";
        String lastName4 = "Hunter";
        Double[] examScores4 = { 100.0, 150.0, 250.0, 0.0 };
        Student student4 = new Student(firstName4, lastName4, examScores4);

        // When
        String output4 = student4.toString();//

        // Then
        System.out.println(output4);//

//1.8
        // : Given
        Double[] s1Scores = { 100.0, 175.0 };// 1st student test scores
        Double[] s2Scores = { 225.0, 25.0 };//2nd student test scores

        Student s1 = new Student("student", "one", s1Scores);// 1st students name
        Student s2 = new Student("student", "two", s2Scores);//2nd students

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);// new classroom containing two students

        // When
        double output5 = classroom.getAverageExamScore();// getting the average exam score

        // Then
        System.out.println(output5);
//1.9
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom1 = new Classroom(maxNumberOfStudents);
        Double[] examScores5 = { 100.0, 150.0, 250.0, 0.0 };// testScores for student 5
        Student student5 = new Student("Leon", "Hunter", examScores5);// making a new student

        // When
        Student[] preEnrollment = classroom1.getStudents();//who is in classroom one and storing them in pre-enrollment
        classroom1.addStudent(student5); //adding new student5
        Student[] postEnrollment = classroom1.getStudents();//checking to see students 1 and 12 made it into the classroom

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);//seeing if there are any students in the classroom and put them in a string format
        String postEnrollmentAsString = Arrays.toString(postEnrollment);// adding two new students and put them in a string format

        System.out.println("===========================");//space
        System.out.println(preEnrollmentAsString);// checking if students were in the classroom
        System.out.println("===========================");//space
        System.out.println(postEnrollmentAsString);//checking if the students are in the classroom after adding two students

        classroom1.removeStudent("Leon", "Hunter");//removing student leon hunter from the classroom

        classroom.getStudentsByScore();// getting students by score

        classroom.getGradeBook();//getting all grades


    }
}
