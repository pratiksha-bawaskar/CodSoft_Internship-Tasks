package Tasks;

import java.util.Scanner;
public class Student_Grade_Calculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int subjects;
	        double total = 0;

	        System.out.print("Enter number of subjects: ");
	        subjects = scanner.nextInt();

	        for (int i = 1; i <= subjects; i++) {
	            double marks;
	            while (true) {
	                System.out.print("Enter marks for subject " + i + ": ");
	                marks = scanner.nextDouble();

	                if (marks < 0) {
	                    System.out.println("❌ Invalid input. Please enter only positive numbers.");
	                } else {
	                    break;
	                }
	            }
	            total += marks;
	        }

	        double average = total / subjects;
	        String grade;

	        if (average >= 90) grade = "A+";
	        else if (average >= 80) grade = "A";
	        else if (average >= 70) grade = "B";
	        else if (average >= 60) grade = "C";
	        else if (average >= 50) grade = "D";
	        else grade = "F";

	        System.out.println("\n✅ Total Marks: " + total);
	        System.out.println("📊 Average: " + average);
	        System.out.println("🏅 Grade: " + grade);

	        scanner.close();
	    }
	}

