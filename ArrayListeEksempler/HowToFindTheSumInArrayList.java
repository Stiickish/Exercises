package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToFindTheSumInArrayList {

    //Hvordan man finder summen af inputs i en ArrayList

    public static void main(String[] args) {            //Main
        Scanner scanner = new Scanner(System.in);           //Scanner input i konsol
        ArrayList<Integer> numbers = new ArrayList<>();  //Ny ArrayListe

        int sum = 0; //Erklærer en ny variabel til at holde på summen af alle tallene
        int value = 0; //Erklærer en ny variabel til at finde gennemsnit

        while (true) {          //While loop
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {          //Hvis input er lig -1 luk program
                break;
            }

            numbers.add(input);         //Tilføj inputs til arraylisten

            value = value + 1;          //Value var 0. Men +1 betyder at den skal plusse 1 ekstra på hvergang
            sum = sum + input;          //Summen er 0 + input.


            // implement here a program, that first reads user input
            // adding them on a list until user gives -1.
            // Then it computes the average of the numbers on the list
            // and prints it.

        }
        System.out.println("Average: " + (double) sum / value);
        //printer summen ud. (double)sættes foran så det bliver et komma tal
        //sum divideres med value så vi får gennemsnittet
    }

}
