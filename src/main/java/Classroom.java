import java.sql.Array;
import java.util.*;

public class Classroom {
    private Student[] students; // initialized a private array named Students
    private int maxOfStudents; //initialized a private int named maxNumberOfStudents
    private Double getAverageExamScore;// initialized a private double


    public Classroom(int maxOfStudents) {
        this.maxOfStudents = maxOfStudents;
    }// The constructor Takes maxOfStudents so it know how much a classroom can "hold"

    public Classroom(Student[] students) {
        this.students = students;
    }// constructor that saves a list so that the "classroom" knows who the students are

    public Classroom() {// default constructor for this class
        this.maxOfStudents = 30;// the max number of students is set to 30
        this.students = new Student[maxOfStudents];// an empty array that we will fill in with students
    }

    public Student[] getStudents() {
        return students;
    }// list all students/and returns the list

    //
    public Double getAverageExamScore() { // get average for any students
        Double totalScore = 0.0;// create container to store all exams scores starts at 0
        int totalExams = 0;// keeps track of how many exams there are/ starts at 0

        for (Student student : students) { // looping through a list of students
            Double[] testScores = student.getTestScore();//  getting test scores by student
            for (Double score : testScores) {//loops through the testScores array, and it's looking for a score
                totalScore += score; // adding the overalls together example 80+100= 180
            }
            totalExams += testScores.length; // numbers of exams divided by the amount of test scores
        }

        return totalScore / totalExams;// then we use testScore/ the total number of exams to get the average
    }

    public void addStudent(Student student) {//method to add a student
        students = new Student[]{student}; // adding a new student to an array
    }

    public void removeStudent(String firstName, String lastName) {// method to remove a student
        List<Student> numbersList = new ArrayList<>(Arrays.asList(students));//making the list of students into an array

        for (int i = 0; i < numbersList.size(); i++) {// as long as i is less then numbersList keep looping
            Student student = numbersList.get(i);// selecting student 1,2,3
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                numbersList.remove(i); // if a student has a first name is and last name is inputted in a string he/she will be dropped for the class
                i--;
            }
        }

        System.out.println(numbersList);//  removes student
    }


    public void getStudentsByScore() {
        List<Student> numbersList = new ArrayList<>(Arrays.asList(students)); // making an array list and making it easier to work with
        Collections.sort(numbersList, new StudentComparator());// sorting students and rearranges them by score

        for (Student i : numbersList) {// loops through the numbersList
            System.out.println(i);// prints out student info name and testScores
        }
    }


    public void getGradeBook() { // last question making a grading scale for students
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









