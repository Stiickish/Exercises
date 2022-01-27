package ReturnTypes;

import java.util.ArrayList;

public class ReturnTypes {
    public static void main(String[] args) {

/*
        ReturnTypes rt = new ReturnTypes();
        rt.doSomething();
        System.out.println(rt);

        ReturnTypes ss = new ReturnTypes();
        ss.saySomething();
        System.out.println(ss);

 */

        System.out.println(doSomething());
        System.out.println(saySomething());

        ReturnTypes s = new ReturnTypes();
        s.something();
        ArrayList<String> name = new ArrayList<>();
        name.add("Long");
        name.add("He");
        System.out.println(name);

    }

    public static int doSomething() {
        int a = 2;
        int b = 4;
        int c = a * b;
        return c;

    }

    public static String saySomething() {
        String a = "Hello";
        String b = "World";
        String c = a + b;
        return c;

    }

    public ArrayList<String> something() {
        ArrayList<String> name = new ArrayList<>();
        String a = "Long";
        String b = "He";
        return name;
    }

}
