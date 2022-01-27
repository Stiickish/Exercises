package ArrayListeEksempler;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToAccessLastInputFromArrayList {

    //Hvordan man finder det sidste indtastede nummer fra en ArrayList med inputs fra brugeren

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);

        }
        System.out.println(list.get(list.size() - 1));
    }
}

