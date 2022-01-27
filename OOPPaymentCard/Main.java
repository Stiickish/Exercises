package OOPPaymentCard;

public class Main {


    public static void main(String[] args) {
        // write experimental main programs here

        PaymentTerminal unicafeExactum = new PaymentTerminal(); //New object of PaymentTerminal
        System.out.println(unicafeExactum); //Prints the object

        PaymentCard annesCard = new PaymentCard(2); //new object of PaymentCard, which sets the balance to 2.

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros"); //Printing the balance

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);  //New variabel wasSuccessful is equal cafe object
        System.out.println("there was enough money " + wasSuccessful);  //If there is enough money on card, print true otherwise false

        unicafeExactum.addMoneyToCard(annesCard, 100);  //adding money to card

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);  //buying food, check if enough money on card
        System.out.println("there was enough money: " + wasSuccessful); //print if wether there is enough money on card.

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros"); //printing new balance on card

        System.out.println(unicafeExactum); //prints the balance for cafe.

        //part2 PaymentTerminal unicafeExactum = new PaymentTerminal();
        //part3 PaymentTerminal unicafeExactum = new PaymentTerminal();
        //part2 double change = unicafeExactum.eatAffordably(10);
        //part2 System.out.println("remaining change " + change);
        //part3 double change = unicafeExactum.eatAffordably(10);
        //part3 System.out.println("remaining change " + change);
        //part3 PaymentCard annesCard = new PaymentCard(7);
        //part3 boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        //part3 System.out.println("there was enough money: " + wasSuccessful);
        //part3 wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        //part3 System.out.println("there was enough money: " + wasSuccessful);
        //part3 wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        //part3 System.out.println("there was enough money: " + wasSuccessful);
        //part3 System.out.println(unicafeExactum);
        //part2 change = unicafeExactum.eatAffordably(5);
        //part2 System.out.println("remaining change " + change);
        //part2 change = unicafeExactum.eatHeartily(4.3);
        //part2 System.out.println("remaining change " + change);
        //part2 System.out.println(unicafeExactum);
        //part1 PaymentCard petesCard = new PaymentCard(10);
        //part1 System.out.println("money " + petesCard.balance());
        //part1 boolean wasSuccessful = petesCard.takeMoney(8);
        //part1 System.out.println("successfully withdrew: " + wasSuccessful);
        //part1 System.out.println("money " + petesCard.balance());
        //part1 wasSuccessful = petesCard.takeMoney(4);
        //part1 System.out.println("successfully withdrew: " + wasSuccessful);
        //part1 System.out.println("money " + petesCard.balance());
    }
}

