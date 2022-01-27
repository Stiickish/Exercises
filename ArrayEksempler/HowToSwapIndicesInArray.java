package ArrayEksempler;

import java.util.Scanner;

public class HowToSwapIndicesInArray {

    //Hvordan man swapper pladser i et array

    public static void main(String[] args) {        //Main

        Scanner scanner = new Scanner(System.in);       //Scanner til inputs i konsol
        int[] array = new int[5];       //Int array med 5 pladser
        array[0] = 1;   //plads 1
        array[1] = 3;   //plads 2
        array[2] = 5;   //plads 3
        array[3] = 7;   //plads 4
        array[4] = 9;   //plads 5

        int index = 0;  //Opretter en ny int variabel som hedder INDEX som er tomt.
        while (index < array.length) {  //while loop. Så længe index(0) er mindre end array længde som er 5
            System.out.println(array[index]);   //printer arrayet ud
            index++;        //incrementer. starter på plads 0 og plusser 1 på indtil arrayets længde er nået
        }
        System.out.println("");

        System.out.println("Give to indices to swap: ");

        int num1 = Integer.valueOf(scanner.nextLine()); //Opretter en ny variabel med scanner input
        int num2 = Integer.valueOf(scanner.nextLine()); //Opretter en ny variabel med scanner input

        int helper = array[num1];       //swapper. Ny variabel af int helper. Sætter den lig med vores første input
        array[num1] = array[num2];      //array med første input er lig array med 2 input
        array[num2] = helper;           //array med 2 input er nu vores variabel helper

        // Implement here
        // asking for the two indices
        // and then swapping them
        System.out.println("");
        index = 0;                      //printer arrayet ud igen, med de nye placeringer
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

}

