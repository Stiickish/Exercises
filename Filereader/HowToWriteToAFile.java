package Filereader;

import java.io.FileWriter;

public class HowToWriteToAFile {


    public static void main(String[] args) {

        //Husk try catch om fil læsning, skrivning etc. ALTID!
        try {
            FileWriter writeToFile = new FileWriter("src/Filereader/file.txt"); //Find en fil at skrive til
            writeToFile.write("Write to file in Java is hard, but once you get the hang of it, it's quite simple!"); //Skriv det man har lyst til
            writeToFile.close(); //Husk at lukke filen
            System.out.println("Succesfully wrote to the file");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
