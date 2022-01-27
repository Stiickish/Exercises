package EksamensopgaveHilsen;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        GreetingsFileReader greetingsFileReader = new GreetingsFileReader();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hvilken hilsen søger du? Indtast navn");
        String input = scan.nextLine();
        String hilsen = greetingsFileReader.getGreetings();
        System.out.println(hilsen.replace("*", input));
    }
}