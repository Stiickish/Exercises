package Test;

import java.util.ArrayList;

public class Ordleg {

    public static void main(String[] args) {

        Ordleg ol = new Ordleg();
        ArrayList<String> helloWorld = new ArrayList<>();
        helloWorld.add("hello");
        helloWorld.add("world");
        System.out.println(ol.gentagOrd(helloWorld,3));

    }

    public ArrayList<String> gentagOrd(ArrayList<String> ord, int k) {

        ArrayList<String> gentagneOrd = new ArrayList<>();

        if (k <= 0) {
            throw new IllegalArgumentException("K cant be minus or 0");
        } else if (gentagneOrd == null) {
            throw new IllegalArgumentException("arraylist cant be null");
        } else {
            for (int i = 0; i < ord.size(); i++) {
                for (int j = 0; j < k; j++) {
                    gentagneOrd.add(ord.get(i));
                }
            }
            return gentagneOrd;
        }

    }

}

