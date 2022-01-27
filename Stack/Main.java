package Stack;

public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack(); //New stack object

        //Adding to our stack
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        //Print, aslong stack isn't empty
        while (!s.isEmpty()) {
            System.out.println(s.take());
        }

    }
}
