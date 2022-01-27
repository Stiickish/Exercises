package OOPHowToUseCompareWithMethods;

public class Apartment {

//Opgaven viser hvordan man bruger metoden compared til at sammenligne med.
    //Compared bruges i metode parametrene

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    //Method, returns true or false. Takes Apartment class in as paramter
    //Remember to use "compared" in the parameters to compare the apartments
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {   //Should return true, if apartment is bigger than compared
            return true;
        }
        return false;
    }

    //Method returns an int. Takes in Apartment as parameter
    public int priceDifference(Apartment compared) {
        int difference = 0; //used to find the price difference
        int price = 0;  //used to find the price between two apt
        int comparedPrice = 0;  //used to find what each cost, so we can compare

        //First we find the price
        price = this.princePerSquare * this.squares;

        //Then we find the compared price bethween the estates
        comparedPrice = compared.princePerSquare * compared.squares;

        //Then we find the price difference
        difference = price - comparedPrice;

        //Math.abs(int x) is used to find the absolute value of two numbers.
        //If not used, the return difference will be in minus. If used, return value
        //will be a plus number
        return Math.abs(difference);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price = 0;  //used to find the price of the two apt
        int comparedPrice = 0;  //We compare the price of the two apt
        price = this.princePerSquare * this.squares;    //finding the price
        comparedPrice = compared.princePerSquare * compared.squares; //comparing the prices
        if (price > comparedPrice) {
            return true;
        }
        return false;
    }
}


