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

    public void addExamScore(double examScore) {
        ArrayList<Double> arrayList = new ArrayList<>(Arrays.asList(testScore));
        // converts test scores into an array list

        arrayList.add(examScore);

        // add exam scores to the list

        testScore = arrayList.toArray(testScore);

        // then convert test scores back to an array

    }

    public void setExamScore(int examNumber, double newScore) {
        int index = examNumber - 1;
        // because index starts at 0 we -1
        // examNumber = current index

        if (index >= 0 && index < testScore.length) {
            testScore[index] = newScore;
            // testscore with index of exam number

            // set the current test score index = to new score

        } else {
            System.out.println("Invalid exam number");
        }
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

