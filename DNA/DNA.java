package DNA;

//1. Make a class called DNA with a main in it.
//2. Store the 3 different protein strings in a 3 different String variabels
//3. Create a generic String variabel called dna, that can be set to any DNA sequence
//4. Find the length of each DNA Strings using .length()
//5. Find the start/stop codon "ATG" / "TGA"
//6. Use if statement to find the protein.
public class DNA {

    public static void main(String[] args) {

        //This program checks DNA for protein

        //Storing DNA strings in 3 different String variabels
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        //generic String variabel possible to set any String variabel to
        String dna = dna1;

        //Declaring an int called length and set it equals to dna.length(). Checking the length() of each DNA String
        int length = dna.length();
        System.out.println("Length: " + length);

        //Declaring an int variabel called start and set it equals to dna.indexOf() to find where ATG starts
        int start = dna.indexOf("ATG");
        System.out.println("Start: " + start);

        //Declaring an int variabel called stop and set it equals to dna.indexOf() to find where TGA stops
        int stop = dna.indexOf("TGA");
        System.out.println("Stop: " + stop);

        //Using if statement to check for protein
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            String protein = dna.substring(start, stop + 3);
            System.out.println("Protein: " + protein);
            System.out.println("Condition 1 and 2 and 3 are satisfied");
        } else {
            System.out.println("No protein");
        }

    }

}

