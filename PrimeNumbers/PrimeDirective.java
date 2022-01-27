package PrimeNumbers;

import java.util.ArrayList;

public class PrimeDirective {

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        System.out.println(pd.onlyPrimes(numbers));

    }

    //isPrime method, with int number as parameter. Using boolean as a return type
    public boolean isPrime(int number) {
        if (number == 2) { //If number is equal to 2, return true
            return true;
        } else if (number < 2) { //If number is less than 2, return false
            return false;
        }
        for (int i = 2; i < number; i++) { //For loop running through number
            if (number % i == 0) { //If number divisible with i equals 0, return false
                return false;
            } else if (number < 2) { //If number divisible with i not equals 0, and number is less than 2, return false
                return false;
            }
        }
        return true; //Otherwise return true if neither
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) { //Arraylist with Integers with int[] numbers as parameter
        ArrayList<Integer> primes = new ArrayList<Integer>(); //new Integer ArrayList called primes
        for (int number : numbers) { //For each loop, for each number in numbers
            if (isPrime(number)) { //If the number is prime, add the number in the primes arrayList
                primes.add(number);
            }
        }
        return primes; //return the values of primes from ArrayList
    }
}


