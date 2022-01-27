package EksamensopgaveToSlagsSpillere;

import java.util.Scanner;

public class Menneskespiller implements Spiller {

    @Override
    public int gætEtTal(int max) {
        System.out.println("Gæt et tal mellem 1 og " + max);
        try(Scanner scanner = new Scanner(System.in)){
            int userInput = scanner.nextInt();
            System.out.println("Du har gættet på: " + userInput);
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return 0;   //Returnere 0 metoden, som vi kan kalde i main
    }

}
