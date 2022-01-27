package OOPDecreasingCounter;

public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {    //Constructor
        this.value = initialValue; //Instantiating the variabel
    }

    public void printValue() {  //Print value method
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {   //Decrement method.
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (this.value != 0) { //If value is not 0, then this.value -1 (decrement)
            this.value = this.value - 1;

        }
    }

    public void reset() {   //Resets the counter
        this.value = 0;
    }
}