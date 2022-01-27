package TryCatch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TryCatchStatistics {

    //Denne opgaver handler om at læse fra en txt fil.
    //Den handler om hvordan man printer kamp statistik ud, via en txt fil
    //Der bruges scanner til inputs
    //metoden split til at splitte data ved enten komma, punktummer eller andet
    //Der bruges arrays til at gemme data efter split
    //Der bruges toLowerCase metoden, så man kan skrive små bogstaver.
    //Denne opgaver viser hvordan man læser fra en csv fil


    public static void main(String[] args) {    //Main
        Scanner scan = new Scanner(System.in);  //Inputs in console

        System.out.println("File: ");   //Ask for file name
        String fileName = scan.nextLine();  //Our users answer

        System.out.println("Team: ");   //Ask for team name
        String teamName = scan.nextLine().toLowerCase(); //So we also can use lowercases

        int gamesCounter = 0; //Games counter, so show how many games they played
        int wins = 0;   //win counter for both teams
        int losses = 0;  //loses counter for both teams

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {    //Try reading the file
            while (scanner.hasNextLine()) {   //Runs as long there is a next line
                String[] stringSplit = scanner.nextLine().split(",");   //Splits the file at comma

                if (stringSplit.equals("")) { //If there is an empty line in our txt.
                    continue;                   //Then do nothing, and continue reading
                }
                String homeTeam = stringSplit[0];    //saves hometeam at index 0
                String visitingTeam = stringSplit[1];    //saves visitingteam at index 1

                int homeTeamPoints = Integer.valueOf(stringSplit[2]); //Saves home team points at index 2
                int visitingTeamPoints = Integer.valueOf(stringSplit[3]); //Saves visiting team points at index 3

                //if the input is equal a home team name
                //increment the gamesCounter.
                if (teamName.equals(homeTeam.toLowerCase())) {
                    gamesCounter++;

                    //if home team have higher value in points than visiting team
                    //increment on wins. If its lower than visiting team, then decrement in losses
                    if (homeTeamPoints > visitingTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                //If the input is equal to a visiting team name
                //increment the gamesCounter
                if (teamName.equals(visitingTeam.toLowerCase())) {
                    gamesCounter++;

                    //If visiting team have more points than home team
                    //increment wins. Otherwise increment losses if they have less than home team
                    if (visitingTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            System.out.println("Games: " + gamesCounter);   //print how many games played
            System.out.println("Wins: " + wins);    //how many games won
            System.out.println("Losses: " + losses);    //how many games lost

        } catch (Exception e) { //prints an error if no txt file can be found
            System.out.println("Error: " + e.getMessage());
        }
    }

}

