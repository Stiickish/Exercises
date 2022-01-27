package ArrayEksempler;

public class SumOfArray {

    //Hvordan man finder summen i et array.

    public static void main(String[] args) {            //Main

        int[] array = {5, 1, 3, 4, 2};                  //int array med tilføjede elementer
        System.out.println(sumOfNumbersInArray(array)); //printer metoden
    }

    public static int sumOfNumbersInArray(int[] array) {        //metode

        int sum = 0;        //Ny variabel af int. sættes til 0

        for (int i : array) {       //For each loop, der løber igennem array'et og gemmer tallet i sum, som plusses på i
            sum = sum + i;
        }

        return sum;                 //returnere sum, som bruges n¨r vi kalder metoden
    }
}