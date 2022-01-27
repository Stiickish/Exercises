package Menu;

import java.util.Scanner;

public class SimpleTextIO implements TextIO {

private Scanner scan;

    public SimpleTextIO() {
        this.scan = new Scanner(System.in);
    }

    @Override
    public void output(String text) {
        System.out.println(text);
    }

    @Override
    public String input() {
        return scan.nextLine();
    }
}
