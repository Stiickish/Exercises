package Strings;

import java.util.Scanner;

public class HowToFindTheNameOfTheOldestByAge {

//Hvordan man kan finde den ældste person, vha alder. Der bruges .split() og while loop

    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);       //Scanner til inputs i console
        String input = scanner.nextLine();          // Så user kan skrive i console

        String oldest = null;           //Ny String variabel sættes til null, så det er tomt og man kan gemme text i det
        int greatest = 0;               //Ny int variabel sættes til nul. Bruges til at gemme
        String[] number = new String[0]; //String array Number er nu String på plads 0

        while (!input.isEmpty()) {      //Hvis input ikke er tomt,så er number lig med bruger input og skal splittes ved ,
            number = input.split(",");

            for (int i = 1; i < number.length; i++) {       //for loop, hvor vi kører igennem number arrayet
                if (Integer.valueOf(number[i]) > greatest) {//Vi bruger Integer.valueOf for at sammenligne en String med en Int. Så hvis
                    greatest = Integer.valueOf(number[i]);//String number er større end Int greatest, så skal greatest være det nye number
                    oldest = number[i - 1];//Oldest er derefter sat lig med number som er alderen
                }
            }
            input = scanner.nextLine(); //programmet stoppes ved tom input
        }
        System.out.println("Age of the oldest: " + oldest); //print
    }

}

