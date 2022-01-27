package HowToParse;

import java.util.ArrayList;
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
/*
        double  --> Double.parseDouble(String);
        float   --> Float.parseFloat(String);
        long    --> Long.parseLong(String);
        int     --> Integer.parseInt(String);
        char    --> stringGoesHere.charAt(int position);
        short   --> Short.parseShort(String);
        byte    --> Byte.parseByte(String);
        boolean --> Boolean.parseBoolean(String);

 */

        //How to parse from String to Integer
        int n = 8;
        int a = Integer.parseInt("3");
        System.out.println(a);

        //How to parse from Integer to String
        int q = 8;
        System.out.println(Integer.toString(q));

        //How to get only the numbers out from a String
        String age = "Age: 47";
        age = age.replaceAll("\\D+","");
        int h = Integer.parseInt(age);
        System.out.println(h + 2);




        int x = 10;
        String y = "10";
        char w = y.charAt(0);
        boolean sandt = true;
        System.out.println(Integer.parseInt(y));
        System.out.println(Double.valueOf(x));
        System.out.println(Double.parseDouble(y));
        System.out.println(String.valueOf(x));
        System.out.println(w);
        System.out.println(Boolean.parseBoolean("sandt"));


        ArrayList<String> test = new ArrayList<>();
        test.add("hej");
        test.add("med");
        test.add("fremmede");

        for (String s : test) {
            System.out.println(s);

            String[] HelloWorld = {"Hej", "med", "dig", "fremmede"};
            for (int i = 0; i < HelloWorld.length; i++) {
                System.out.println(Arrays.toString(HelloWorld));

                String[] helloWorld = new String[3];
                helloWorld[0] = "Hello";
                helloWorld[1] = "world";
                helloWorld[2] = "stranger";
                for (int j = 0; j <= 2; j++) {
                    System.out.println(helloWorld[j] + " ");

                }
            }
        }
    }
}
