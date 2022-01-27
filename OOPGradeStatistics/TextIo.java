package OOPGradeStatistics;

import java.util.Scanner;


public class TextIo {

    private Scanner scanner;
    private Grade grade;

    public TextIo(Scanner scanner, Grade grade) {
        this.scanner = scanner;
        this.grade = grade;
    }

    public void start() {
        System.out.println("Enter points total, -1 stops: ");
        while (true) {

            int points = Integer.valueOf(scanner.nextLine());

            if (points == -1) {
                grade.print();
                break;
            } else {
                grade.addGrade(points);
            }
        }
    }

}

