package OOPGradeStatistics;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into
        // multiple classes.
        Grade grade = new Grade();
        TextIo io = new TextIo(scanner, grade);
        io.start();

    }
}



