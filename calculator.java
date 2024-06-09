import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();


        int totalMarks = 0;

     
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
                continue; // Skip to next iteration if marks are invalid
            }

            totalMarks += marks;
        }

       
        double averagePercentage = (double) totalMarks / numSubjects;

       
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close(); // Close the Scanner to avoid resource leaks
    }

}
