package ArrayListeEksempler;

import java.util.ArrayList;

public class HowToFindElementsInRange {

    //Hvordan man finder elementer i en ArrayListe, med flere paramtre i en metode

    public static void main(String[] args) {            //Main

        ArrayList<Integer> list = new ArrayList<>();        //Lav en ny ArrayListe med den rigtige variabel og valgfrit navn
        list.add(3);                                        //Tilføj alle elementerne til ArrayListen
        list.add(2);
        list.add(6);
        list.add(-1);
        list.add(5);
        list.add(1);
        printNumbersInRange(list, 0, 5);      //Print elementerne ud, udfra parameterne som er sat i metoden
        printNumbersInRange(list, 3, 10);   //Vi kalder metoden

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        //Metode med flere parametre
        System.out.println("The number in range [" + lowerLimit + ", " + upperLimit + "]");
        for (int number : numbers) {        //For each loop til at løbe parameterne igennem
            if (number >= lowerLimit && number <= upperLimit) { //hvis number er større end lowerLimit og number er mindre end upperLimit
                System.out.println(number);         //Print number
            }
        }

    }
}
