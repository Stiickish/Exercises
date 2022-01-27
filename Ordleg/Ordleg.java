package Ordleg;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
1. Skriv en klasse der hedder Ordleg.
2. Skriv metoden gentagOrd der tager et parameter af typen ArrayList<String> og et parameter k af typen
int, og har returtypen ArrayList<String>.
3. Metoden skal returnere en ny ArrayList hvor hver String i input-arraylisten er gentaget k gange.
4. Et kald til metoden med en ArrayList med elementerne ”Hello” og ”World” og et integer-argument med værdien 3
skal returnere en ArrayList med elementerne ”Hello”, ”Hello”, ”Hello”, ”World”, ”World”, ”World”.
5. Hvis k er 0 eller et negativt tal skal der kastes en exception. Der skal også kastes en exception hvis
arraylisten der gives som parameter er null.
*/
public class Ordleg {

    public static void main(String[] args) {
        Ordleg ol = new Ordleg();
        ArrayList<String> helloWorld = new ArrayList<>();
        helloWorld.add("Hello");
        helloWorld.add("World");

        try{
        System.out.println(ol.repeatedWords(helloWorld, 3));
    }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> repeatedWords(ArrayList<String> word, int k) {
        ArrayList<String> repeatWord = new ArrayList<>();

        if (k < 0) {
            throw new IllegalArgumentException("K can't be less than 0, try again");
        }
        if (word == null) {
            throw new IllegalArgumentException("ArrayList is null, try again");
        } else {

            for (int i = 0; i < word.size(); i++) {
                for (int j = 0; j < k; j++) {
                    repeatWord.add(word.get(i));
                }

            }
            return repeatWord;
        }
    }
}

