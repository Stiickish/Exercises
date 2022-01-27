package EksamensopgaveStenSaksPapir;

import java.util.Scanner;

public class Main {

    /*
I denne opgave skal du lave et Sten Saks Papir-spil hvor en bruger kan spille mod computeren.

Reglerne er: Papir vinder over Sten, Sten vinder over Saks, Saks vinder over Papir.

Skriv en klasse der hedder StenSaksPapir.

Skriv metoden brugerValg der skal prompte brugeren til at skrive enten ”Sten”, ”Saks” eller ”Papir”, der
læses med en Scanner. Metoden returnerer en String.

Skriv metoden computerValg der skal returnere en tilfældig String som er enten ”Sten”, ”Saks” eller
”Papir”. Brug fx et Random-objekt til at få en tilfældig int der er enten 0, 1, eller 2.

Skriv metoden spil der kalder computerValg og brugerValg, og tjekker om den ene eller den
anden vinder, eller om de står lige. Det udskrives til konsollen hvem der har vundet (computeren eller
brugeren), eller om det blev uafgjort.
HINT: brug en switch med den String du får tilbage fra kaldet til brugerValg

     */
    public static void main(String[] args) {
        StenSaksPapir stenSaksPapir = new StenSaksPapir();
        stenSaksPapir.spil();


    }
}
