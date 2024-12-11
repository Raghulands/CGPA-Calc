import java.util.Scanner;

public class CGPACalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double totalMarks = 0;
           for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter grade point for subject " + i + ": ");
            double gradePoint = scanner.nextDouble();
            totalMarks += gradePoint;
        }

        double cgpa = totalMarks / numSubjects;
        System.out.println("Your CGPA is: " + cgpa);
        scanner.close();
    }
}