package Strings;

import java.util.Scanner;

public class UsernameAndPassword {

    //Hvordan man laver en simpel username og password sammenligning

    public static void main(String[] args) {        //Main
        Scanner scanner = new Scanner(System.in);       //Scanner input

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        //Hvis brugernavn er lig med "" og password er lig med "" ELLER brugernavn er lig med "" og password er lig med "" så print
        //ellers print noget andet

        if (username.equals("alex") && password.equals("sunshine") || username.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in! ");
        } else {
            System.out.println("Incorrect username or password! ");
        }

    }
}
