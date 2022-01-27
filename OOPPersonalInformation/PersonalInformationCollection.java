package OOPPersonalInformation;

import OOPPersonalInformation.PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class


        //Initialized ArrayList of PersonInformation, called infoCollection
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);   //user inputs

        while (true) {  //While loop runs intil condition is met
            System.out.println("First name: "); //Print
            String first = scanner.nextLine();  //user input firstname
            if (first.isEmpty()) {  //If empty input, stop program
                break;
            }
            System.out.println("Last name: ");  //print
            String last = scanner.nextLine();   //user input, last name
            System.out.println("Identification number: ");  //Print
            String idNumber = scanner.nextLine();   //user input idNumber

            //ading firstname, lastname and idnumber to our ArrayList
            infoCollection.add(new PersonalInformation(first, last, idNumber));

        }
        //For each loop, runs through our arrayList. We use .getFirstNam() and
        //.getLastName() to get only the names. We dont want the idnumber. If we wanted the id
        //we could simply just print pinfo.
        for (PersonalInformation pinfo : infoCollection) {
            System.out.println(pinfo.getFirstName() + " " + pinfo.getLastName());
        }
    }
}
