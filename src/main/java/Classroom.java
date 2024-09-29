import java.sql.Array;
import java.util.*;

public class Classroom {
    private Student[] students;
    private int maxOfStudents;
    private Double getAverageExamScore;


    public Classroom(int maxOfStudents) {
        this.maxOfStudents = maxOfStudents;
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        this.maxOfStudents = 30;
        this.students = new Student[maxOfStudents];
    }

    public Student[] getStudents() {
        return students;
    }

    //
    public Double getAverageExamScore() {
        Double totalScore = 0.0;
        int totalExams = 0;

        for (Student student : students) {
            Double[] testScores = student.getTestScore();
            for (Double score : testScores) {
                totalScore += score;
            }
            totalExams += testScores.length;
        }

        return totalScore / totalExams;
    }

    public void addStudent(Student student) {
        students = new Student[]{student};
    }

    public void removeStudent(String firstName, String lastName) {
        List<Student> numbersList = new ArrayList<>(Arrays.asList(students));

        for (int i = 0; i < numbersList.size(); i++) {
            Student student = numbersList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                numbersList.remove(i);
                i--;
            }
        }

        System.out.println(numbersList);
    }


    public void getStudentsByScore() {
        List<Student> numbersList = new ArrayList<>(Arrays.asList(students));
        Collections.sort(numbersList, new StudentComparator());

        for (Student i : numbersList) {
            System.out.println(i);
        }
    }


    public void getGradeBook() {
        for (Student student : students) {
            if (student.getAverageExamScore() >= 90) {
                System.out.println("You got an A and you are in the upper 10th percentile.");
            } else if (student.getAverageExamScore() <= 89 && student.getAverageExamScore() > 80) {
                System.out.println("You got a B and you are in the 11th - 29th  percentile.");
            } else if (student.getAverageExamScore() <= 79 && student.getAverageExamScore() > 69) {
                System.out.println("You got a C and you are in the 30th to 50th percentile");
                // block of code to be executed if the condition1 is false and condition2 is true
            } else if (student.getAverageExamScore() <= 69 && student.getAverageExamScore() > 59) {
                System.out.println("You got a D and you are in the lower 51st to 89th");
            } else if (student.getAverageExamScore() <= 59 && student.getAverageExamScore() > 0) {
                System.out.println("You got a F and you are in the lower 11th percentile");
            }
        }
    }
}









