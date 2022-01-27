package Filereader;

import javax.imageio.IIOException;
import java.io.File;

public class HowToCreateAFile {

    public static void main(String[] args) {

        try {

            File myFile = new File("src/Filereader/test.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created : " + myFile.getName());
            } else {
                System.out.println("File already exists");
            }

        } catch (Exception e) {
            System.out.println("Error: Something unexpected happened");
            e.getStackTrace();
        }
    }
}
