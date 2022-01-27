package EksamensopgaveMenuValg;

import java.util.ArrayList;
import java.util.Scanner;

public class MinBrugerDialog {  //class

    public ArrayList menuValg(ArrayList<String>list){   //ArrayList menuValg
        int counter = 1;    //Counter starter på 1.

        for(String  s : list){  //For each loop, kører igennem ArrayListen.
            System.out.println("" + counter + ". " + s);    //Printer Arraylist + counter
            counter++;  //Counter incrementer. Så det hedder 1,2,3,4 etc
        }
        //Try catch på scanner input.
        //Hvis vi skriver forkert, så fanger den fejlen
        try (Scanner scan = new Scanner(System.in);) {
            int userInput = Integer.valueOf(scan.nextLine());   //Scanner input til tal
            if (userInput <= list.size() || userInput>= list.size()) {
                System.out.println("" + userInput + ". " + list.get(userInput - 1));
            }
        } catch (Exception e) {
            System.out.println("Det valgte produkt findes ikke på listen. Prøv igen!");
        }
        return list;
    }

}
