import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private Double[] testScore;

    public Student(String firstName, String lastName, Double[] testScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScore = testScore;
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

    public Double[] getTestScore() {
        return testScore;
    }

    public void setTestScore(Double[] testScore) {
        this.testScore = testScore;
    }

    public int getNumberOfExamsTaken(int i) {
        return testScore.length;
    }



    public String getExamScores() {
        String container = "";
        System.out.println("Exam Scores:");
        for (int i = 0; i < testScore.length; i++) {
            container += "   Exam" + " " + (i + 1) + " " + "->" + " " + testScore[i] + "\n";
        }
        return container;

    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (int i = 0; i < testScore.length; i++) {
            sum += testScore[i];
        }
        return sum / testScore.length;
    }



    @Override
    public String toString() {
         String container ="Student Name: " +
                " " + firstName +
                " " + lastName + "\n" +
                "> Average Score: " + getAverageExamScore() + "\n";
        String container1 ="> Exam Scores: " + "\n";

        for (int i = 0; i < testScore.length; i++) { container1 +=
                ("  Exam" + " ") + (i + 1) + (" ") + ("->") + (" ") + (testScore[i]) + ("\n");
        }
        return container + container1;
    }
}

