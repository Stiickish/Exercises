package OOPTelevisionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTelevisionPrograms {


    public static void main(String[] args) {

        //New arraylist
        ArrayList<TelevisionProgram> programs = new ArrayList<>();

        //Scanner for input
        Scanner scanner = new Scanner(System.in);

        //While loop, runs intil condition is met
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) { //If input is empty, stop program
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());

            //Add name and duration to arrayList
            programs.add(new TelevisionProgram(name, duration));
        }
        System.out.println("Program's maximum duration? ");
        int max = Integer.valueOf(scanner.nextLine());
        for (TelevisionProgram program : programs) {    //for each to loop through arrayList
            if (program.getDuration() <= max) { //if program duration is under max, print
                System.out.println(program.toString());
            }
        }
    }
}

