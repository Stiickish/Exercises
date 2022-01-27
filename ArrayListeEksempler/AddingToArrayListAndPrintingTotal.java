package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingToArrayListAndPrintingTotal {


        //Hvordan man tilføjer til arraylisten og printer total antal tal ud

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in); //Scanner

            ArrayList<String> list = new ArrayList<>(); //NY ArrayList

            while (true) {
                String input = scanner.nextLine(); // som tekst
                if (input.equals("")) {
                    break;
                }
                list.add(input); //tilføj til arraylist

            }
            int value = list.size(); //Laver en ny variabel af int type til at holde på dataen
            System.out.println("in total: " + value); //Printer total inputs
        }
    }


