package ArrayEksempler;

public class HowToPrintStars {

//Hvordan man printer et array ud som stjerner, ved hjælp af for each loop og for loop.

    public static void main(String[] args) {        //main

        int[] array = {5, 1, 3, 4, 2};      //Instantiere et nyt int array med elementerne i
        printArrayInStars(array);           //Printer metoden. Skulle gerne printe x antal *, udfra hvad vi har defineret vores int array til
    }

    public static void printArrayInStars(int[] array) {     //Void metode, returnere intet. Tager en int[] som paramter

        for (int value : array) { //for each loop kører igennem arrayet
            for (int j = 0; j < value; j++) { //for loop. j starter på 0. j er mindre end arrayet, og incrementer
                System.out.print("*"); //printer stjernene i arrayet. 5 på første linje, 1 på næste osv.
            }
            System.out.println(""); //Printer ned af
        }

    }
}
