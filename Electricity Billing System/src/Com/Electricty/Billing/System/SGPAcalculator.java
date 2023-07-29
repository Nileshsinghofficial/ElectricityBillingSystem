package Com.Electricty.Billing.System;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class SGPAcalculator {
    public static void main(String[] args) {
        int numSubjects = 9;

        Scanner scanner = new Scanner(System.in);

        int[] subjects = { 406, 407, 408, 410, 405, 414, 456, 458, 459 };
        int[] internalMarks = new int[numSubjects];
        int[] externalMarks = new int[numSubjects];
        double[] credits = { 4.0, 3.0, 4.0, 0.0, 4.0, 3.0, 1.0, 1.0, 1.0 };

        System.out.println("Welcome in SGPA Calculator");
        System.out.println("Enter Internal and External Marks for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter External Marks for subject " + subjects[i] + ": ");
            externalMarks[i] = scanner.nextInt();

            System.out.print("Enter Internal Marks for subject " + subjects[i] + ": ");
            internalMarks[i] = scanner.nextInt();
        }

        scanner.close();

        BigDecimal totalCredits = BigDecimal.ZERO;
        BigDecimal totalGradeValue = BigDecimal.ZERO;

        for (int i = 0; i < numSubjects; i++) {
            if (credits[i] > 0) {
                int maxMarksTotal = getMaxMarksTotal(subjects[i]);
                int totalMarks = internalMarks[i] + externalMarks[i];
                double percentage = (double) totalMarks / maxMarksTotal * 100;

                double gradePoints = getGradePoints(percentage);
                BigDecimal gradeValue = BigDecimal.valueOf(gradePoints).multiply(BigDecimal.valueOf(credits[i]));
                totalCredits = totalCredits.add(BigDecimal.valueOf(credits[i]));
                totalGradeValue = totalGradeValue.add(gradeValue);
            }
        }

        BigDecimal sgpa = totalGradeValue.divide(totalCredits, 2, RoundingMode.HALF_UP);
        System.out.println("SGPA: " + sgpa);
        System.out.println("This Program Made by Nilesh Singh");
    }

    public static double getGradePoints(double percentage) {
        if (percentage > 90) {
            return 10.0;
        } else if (percentage > 80) {
            return 9.0;
        } else if (percentage > 70) {
            return 8.0;
        } else if (percentage > 60) {
            return 7.0;
        } else if (percentage > 50) {
            return 6.0;
        } else if (percentage > 40) {
            return 5.0;
        } else if (percentage > 32) {
            return 4.0;
        } else {
            return 0.0;
        }
    }

    public static int getMaxMarksTotal(int subjectCode) {
        if (subjectCode == 406 || subjectCode == 407 || subjectCode == 411 ||
                subjectCode == 405 || subjectCode == 414) {
            return 150;
        }
        else if (subjectCode == 410) {
            return 75;
        }
        else {
            return 50;
        }

    }
}
