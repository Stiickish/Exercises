package OOPDebt;

import OOPDebt.Debt;

public class MainDebt {

        public static void main(String[] args) {
            // Test your Debt class here

            Debt mortgage = new Debt(120000.0, 1.01); //New instance. Sets our parameter from we have from our constructor
            mortgage.printBalance(); //Prints the balance

            mortgage.waitOneYear();
            mortgage.printBalance();

            int years = 0; //Declaring new variabel. Start year is 0

            while (years < 20) { //While loop runs until condition is met. If years(0) is under 20
                mortgage.waitOneYear();
                years = years + 1;
            }
            mortgage.printBalance();

        }
    }
