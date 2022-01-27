package OOPDebt;

public class Debt {

    //Variables
    private double balance;
    private double interestRate;

    //Constructor, that takes the variables as parameter
    public Debt(double initialBalance, double initialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    //printBalance method is void. Not returning anything. It only shows the current balance
    public void printBalance(){
        System.out.println("balance " + this.balance);
    }
    //waitOneYear method is void. Not returning anything. It only calculates
    public void waitOneYear(){
        this.balance = this.balance * this.interestRate;
    }
}
