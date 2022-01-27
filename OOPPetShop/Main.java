package OOPPetShop;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //dont know why there is a scanner?

        Pet hulda = new Pet("Hulda", "Golden retriever");   //new object of Pet called Hulda. Setting the infomation from constructor
        Person leo = new Person("Leo", hulda);  //New object of Person. Setting the information after the constructor

        System.out.println(leo);    //Print leo

    }
}

