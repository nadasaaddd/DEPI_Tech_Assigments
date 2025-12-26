package LoginSys_Assignment2;

import java.util.Scanner;

public class User_Info {
    final int code = 1234;
    String name;
    int age;
    double score;
    char grade;
    Scanner scanner = new Scanner(System.in);

    public void userInfo() {
        System.out.println("Enter Full Name: ");
        name = scanner.nextLine();

        System.out.println("Enter Age: ");
        age = scanner.nextInt();

        do {
            System.out.println("enter score: ");
            score = scanner.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("Wrong Score! Score must be from 0 to 100! ");
            }
        } while (score < 0 || score > 100);

    }

    public void calcGrade() {
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }
}
