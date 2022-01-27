package OOPBirdObservation;


import java.util.Scanner;

public class TextIo {

    final private Scanner scanner;
    final private BirdDatabase birdDatabase;

    public TextIo(Scanner scanner, BirdDatabase birdDatabase) {
        this.scanner = scanner;
        this.birdDatabase = birdDatabase;
    }

    public void start() {

        try {

            while (true) {
                System.out.println("? ");

                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("quit")) {
                    break;
                } else if (input.equalsIgnoreCase("add")) {
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Name in latin: ");
                    String latinBirdName = scanner.nextLine();

                    birdDatabase.addBird(new Bird(name, latinBirdName));

                } else if (input.equalsIgnoreCase("observation")) {
                    System.out.println("Bird? ");
                    String bird = scanner.nextLine();
                    birdDatabase.observations(bird);
                } else if (input.equalsIgnoreCase("all")) {
                    birdDatabase.printDatabase();
                } else if (input.equalsIgnoreCase("one")) {
                    System.out.println("Bird? ");
                    String oneBird = scanner.nextLine();
                    birdDatabase.printBird(oneBird);
                } else {
                    System.out.println("Unknown command");
                }
            }
        } catch (Exception e) {
            System.out.println("Not a bird! " + e.getMessage());
        }
    }
}
