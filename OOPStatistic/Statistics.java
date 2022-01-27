package OOPStatistic;

public class Statistics {


    private int count; //private variabel count. Havn't been initialized yet
    private int sum; //private variabel sum. Havn't been initialized yet

    public Statistics() { //constructor of statistics. Takes no parameter.
        //We initialize count here to 0
        this.count = 0;
        this.sum = 0;

    }

    public void addNumber(int number) { //addNumber method, takes number int as parameter
        this.count = this.count + 1;    //Adds number to the count
        this.sum = this.sum + number;   //adds all numbers to the sum
    }

    public int getCount() { //Returns the count
        return this.count;
    }

    public int sum() {
        return this.sum; //returns the sum
    }

    public double average() { //calculates the average
        if (this.count != 0) { //If count is not equal 0 then
            return this.sum / (double) this.count; //return the sum of all numbers/how many numbers counted
        }
        return 0; //if count is equal 0, then return 0.
    }
}

