package Spillere;
/*
Skriv et interface der hedder Spiller, som indeholder metoden gætEtTal. Denne metode tager en int
som parameter der angiver hvad det maksimale tal man kan gætte på er (dvs hvis vi kalder variablen for
max, så kan der gættes på et tal mellem 1 og max). Metoden returnerer en int, som er det tal spilleren har
gættet på.
Skriv to klasser som implementerer dette interface:
Menneskespiller, hvor brugeren skal indtaste sit gæt som læses med en Scanner.
Computerspiller som gætter på et tilfældigt tal ved brug af Random
*/
public interface Spiller {
    int gætEtTal(int max);

}

