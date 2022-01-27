package toString;


public class Main {

    public static void main(String[] args) {

        //New instance of SimpleCollection class
        SimpleCollection s = new SimpleCollection("characters");
        System.out.println(s);

        System.out.println();

        s.add("magneto");
        System.out.println(s);

        System.out.println();

        s.add("mystique");
        System.out.println(s);

        System.out.println();

        s.add("phoenix");
        System.out.println(s);

    }
}
