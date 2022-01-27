package Test;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;

        while (true) {
            System.out.println("Provide a value, a negative value end the program");
            int value = Integer.valueOf(scanner.nextLine());
            if (value < 0) {
                break;
            }
            values = values + 1;
            sum = sum + values;
        }
        if (sum == 0) {
            System.out.println("The average of values could not be calculated");
        } else {
            System.out.println("The average of values is: " + (1.0 * sum / values));
        }
    }
}

