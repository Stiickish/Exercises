package ArrayEksempler;

public class HowToPrintNeatly {

    //Hvordan man printer et array ud pænt med komma

    public static void main(String[] args) {        //Main

        int[] array = {5, 1, 3, 4, 2};      //int array med de tilføjede elementer (i)
        printNeatly(array);     //printer metoden forneden
    }

    public static void printNeatly(int[] array) {       //Metode som er void(returnere intet) og tager et int array i parameter
        for (int i = 0; i < array.length; i++) { //for loop, start punkt er 0. i er mindre end arrayets længde og incrementer med 1

            if (i != array.length - 1) {    //Hvis i ikke er lig med arrayets længde -1, print array[i] + "," så der kommer komma efter hvert tal
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]); //hvis i er lig med arrayets længde så bare print i
            }
        }

    }
}

