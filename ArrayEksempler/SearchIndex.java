package ArrayEksempler;

import java.util.Scanner;

public class SearchIndex {

//Hvordan man finder et index i et array med for loop og boolean

    public static void main(String[] args) {        //Main

        Scanner scanner = new Scanner(System.in);       //Scanner input
        int[] array = new int[10];      //Array med 10 pladser
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        boolean found = false;      //Boolean om indexet findes
        for (int i = 0; i < array.length; i++) {        //for loop til at køre igennem array længden
            if (searching == array[i]) {        //Hvis input er lig med array[i]
                System.out.println(searching + " is at index " + i + ".");          //Hvis index er fundet, så print
                found = true;
            }

        }
        if (!found) {           //Hvis index ikke er fundet, så print
            System.out.println(searching + " was not found.");
        }
    }

}
