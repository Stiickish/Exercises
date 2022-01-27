package OOPPaymentCard;

public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.00;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) { //if there is enough money
            affordableMeals = affordableMeals + 1;   //counts the meal
            return card.takeMoney(2.50);    //return card's balance with minus 2.50
        }
        return false;   //return false, if there isn't enough money on card
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {   //if there is enough money
            heartyMeals = heartyMeals + 1;  //counts the meal
            return card.takeMoney(4.30);    //returns card's balance with minus 4.30
        }
        return false;   //return false if there isn't enough money on card
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = payment;

        if (payment >= 2.50) {
            affordableMeals = affordableMeals + 1;
            this.money = this.money + 2.50;
            change = change - 2.50;
        }
        return change;
    }

    public double eatHeartily(double payment) {

        double change = payment;    //Sets payment to a new variabel called change

        if (payment >= 4.30) {  //If we have enough to pay with
            heartyMeals = heartyMeals + 1;  //count the meals
            this.money = this.money + 4.30; //+ 4.30 on money register
            change = change - 4.30; //take 4.30 from our wallet
        }
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return change;
    }

    //Method addMoneyToCard takes to parameter. First one is a call to PaymentCard class
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum >= 0) { //if parameter sum is higher than 0
            card.addMoney(sum); //add money to card.
            this.money = this.money + sum; //sets the new balance on card
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}

